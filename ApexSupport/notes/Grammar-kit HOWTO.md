# 一、通用提醒
+  1、编写一个语法，并不意味生成的分析器可以允许和生成很好的AST。

比较困难的部分是调整一些看起来正确的语法 为 可以工作的语法，如 可以产生可运行分析器的语法。一旦你掌握了一些基础，剩下的就是简单的组装不同部分到一起，成为一个可以运行的解决方案。

+  2、在编辑语法的时候，最好去认为你在一个更好的维度去操纵生成的代码

+  3、手写的类和生成的类应该在不同的源码根路径里

# 二、生成的分析器

## 分析器基础
 每个规则都是要么匹配，要么不匹配，所以每个BNF表达式都是一个bool 表达式

 True，表明输入序列中的一部分匹配到了
 False总是表明没有什么被匹配到，即使一些输入的部分是匹配的。下面是一些 语法->代码 的映射
 + 序列

 ```
// rule ::= part1 part2 part3
public boolean rule() {
  <header>
  boolean result = false;
  result = part1();
  result = result && part2();
  result = result && part3();
  if (!result) <rollback any state changes>
  <footer>
  return result;
}
```
+ 顺序选择


```
// rule ::= part1 | part2 | part3
public boolean rule() {
  <header>
  boolean result = false;
  result = part1();
  if (!result) result = part2();
  if (!result) result = part3();
  if (!result) <rollback any state changes>
  <footer>
  return result;
}
```

+ 零个 或 多个 构造器（construct）
```
// rule ::= part *
public boolean rule() {
  <header>
  while (true) {
    if (!part()) break;
  }
  <footer>
  return true;
}

```

相应地实现了一个或多个可选的谓词和非谓词构造。如您所见，生成的代码可以像任何手写代码一样轻松调试。像pin和recoverWhile这样的属性，规则修饰符为这个通用结构添加了一些行（line）
## 2.2 使用recoverWhile 属性
+ 1、这个属性在大多数场景下，应该在循环中的规则里指明
+ 2、这个规则应该总是有一个pin属性在某处
+ 3、属性值应该是一个可预测的规则，如，保持输入完整


这一部分应该这么定义：
1、有属性的规则照常处理
2、不管结果如何，当谓词（predicate）规则匹配的时候，分析器会继续处理token


```
script ::= statement *
private statement ::= select_statement | delete_statement | ... {recoverWhile="statement_recover"}
private statement_recover ::= !(';' | SELECT | DELETE | ...)
select_statement ::= SELECT ... {pin=1}  // something has to be pinned!
                                         // pin="SELECT" is a valid alternative

```




## 2.3 孤立无援时：外部规则
+ 1、有时候在代码中做一些事情更容易
+ 2、有时候，一些外部依赖是无法避免的
+ 3、有时候，我们有一些在别处实现的逻辑

```
{
  parserUtilClass="com.sample.SampleParserUtil"
}
// 使用方法1
external my_external_rule ::= parseMyExternalRule false 10  // we can pass some extra parameters                                                            // .. even other rules!
rule ::= part1 my_external_rule part3

//使用方法2
// rule ::= part1 <<parseMyExternalRule true 5>> part3      // is a valid alternative
```

## 2.4 具有优先级的紧凑表达式解析

当涉及到表达式时，递归下降解析器在堆栈深度方面效率低下。支持一种更自然、更紧凑的处理方式。

+ 1、所有的“表达式”规则应该继承 “根表达式规则”。当正确这么做后，这会确保AST 会是优化的深度、一致的，即便有错误。由于扩展属性语义，冗余节点将被折叠，根表达式规则节点将永远不会出现在AST中，请使用快速文档（Ctrl-Q/Ctrl-J）进行验证。
+ 2、优先级从顶到底 增加，顺序选择雨衣会被保留
+ 3、对 二进制 和 固定表达式，使用 左递归
+ 4、使用private 规则去定义一组相同优先级的操作符
+ 5、使用 rightAssociative 属性，当默认的 left assiciativity不合适的时候

以下代码片段演示了BNF的“表达式”部分看起来很紧凑，所描述的语法不会对普通的BNF语法造成太大破坏

```
// to keep this sample short function calls and other expressions are omitted
{
  extends(".*expr")=expr
  tokens=[number="regexp:[0-9]+" id="regexp:[a-z][a-z0-9]*"]
}
// the root expression rule
expr ::= assign_expr
  | add_group
  | mul_group
  | unary_group
  | exp_expr
  | qualification_expr
  | primary_group

// private rules to define operators with the same priority
private unary_group ::= unary_plus_expr | unary_min_expr
private mul_group ::= mul_expr | div_expr
private add_group ::= plus_expr | minus_expr
private primary_group ::= simple_ref_expr | literal_expr | paren_expr

// public rules for each expression
assign_expr ::= expr '=' expr { rightAssociative=true }
unary_min_expr ::= '-' expr
unary_plus_expr ::= '+' expr
div_expr ::= expr '/' expr
mul_expr ::= expr '*' expr
minus_expr ::= expr '-' expr
plus_expr ::= expr '+' expr
exp_expr ::= expr ('^' expr) + // N-ary variant, the "(<op> expr ) +" syntax is mandatory.
paren_expr ::= '(' expr ')'

// introduce fake rule with @Nullable qualifier getter and
// let qualified and simple references have its elementType
fake ref_expr ::= expr? '.' identifier
simple_ref_expr ::= identifier {extends=ref_expr elementType=ref_expr}
qualification_expr ::= expr '.' identifier {extends=ref_expr elementType=ref_expr}

literal_expr ::= number
identifier ::= id
```


注意：
+ 1、操作符部分可用包含任意有效的BNF表达式 和 定义 “尾部”，如
```
div_expr ::= expr [div_modifier | '*'] '/' expr div_expr_tail

```
+ 2、指定表达式规则 可用被用来替代 expr  去缩小解析范围
+ 3、在一个语法中，可以有多个“表达式根”，只要它们之间不交叉

所有的操作符会在错误信息中被展示。添加下面的语句可以避免，并且还可以提升性能
```
{
   consumeTokenMethod(".*_expr|expr")="consumeTokenFast"
}

```

为此语法生成的解析器（这是对这里描述的Pratt解析的过程性重写）不包括所有表达式的方法。根规则只有两种方法。注释包括操作员优先级表：

```
/* ********************************************************** */
// Expression root: expr
// Operator priority table:
// 0: BINARY(assign_expr)
// 1: BINARY(plus_expr) BINARY(minus_expr)
// 2: BINARY(mul_expr) BINARY(div_expr)
// 3: PREFIX(unary_plus_expr) PREFIX(unary_min_expr)
// 4: N_ARY(exp_expr)
// 5: POSTFIX(ref_expr)
// 6: ATOM(simple_ref_expr) ATOM(literal_expr) PREFIX(paren_expr)
public static boolean expr(PsiBuilder builder_, int level_, int priority_) {
 // code to parse ATOM and PREFIX operators
 // .. and ..
 // call expr_0()
}

public static boolean expr_0(PsiBuilder builder_, int level_, int priority_) {
 // here goes priority-driven while loop for BINARY, N-ARY and POSTFIX operators
}

```

# HOWTO:生成的PSI类层级结构
## 3.1 PSI基础

+ 1、如果您不希望任何规则尽早出现在AST中，请在该规则上指定私有属性。第一条规则是隐式私有的。
+ 2、利用extends属性同时实现两个目标：使PSI层次结构看起来不错，使AST浅（shallow）。



```
{
  extends(".*_expr")=expr               // make AST for literal one level deep: FileNode/LiteralExpr
                                        //   otherwise it will look like: FileNode/Expr/LiteralExpr
  tokens = [
    PLUS='+'
    MINUS='-'
  ]
  ...
}
expr ::= factor add_expr *
private factor ::= primary mul_expr *   // we don't need this node in AST
private primary ::= literal_expr        // .. and this as well
left add_expr ::= ('+'|'-') factor      // if classic recursive descent is used without "left" rules
left mul_expr ::= ('*'|'/') primary     //    then the AST without "extends" will look even worse:
literal_expr ::= ...                    //    FileNode/Expr/AddExpr/MulExpr/LiteralExpr

```


## 3.2 使用fakse 规则和用户方法去组织PSI

```
{
  extends("(add|mul)_expr")=binary_expr // this attributes can be placed directly after rule
  extends(".*_expr")=expr               // .. but I prefer grammars less cluttered with alien gibberish
}

// won't be taken into account by parser
fake binary_expr ::= expr + {
  methods=[
    left="/expr[0]"                     // will be @NotNull as far as we have "+" in the expression
    right="/expr[1]"                    // "expr" is the name of the auto-calculated child property (singular or list)
  ]
}

expr ::= factor add_expr *
... and the rest of "PSI Basics" example

```

会被在下面的代码中进行处理
```
public interface BinaryExpr {
  List<Expr> getExprList();
  @NotNull
  Expr getLeft();
  @Nullable
  Expr getRight();
}

public interface AddExpr extends BinaryExpr { ... }

public interface MulExpr extends BinaryExpr { ... }

// and PsiElementVisitor implementation
public class Visitor extends PsiElementVisitor {
  ...
  public visitAddExpr(AddExpr o) {
    visitBinaryExpr(o);
  }
  public visitMulExpr(MulExpr o) {
    visitBinaryExpr(o);
  }
  public visitBinaryExpr(BinaryExpr o) {
    visitExpr(o);
  }
  ...
}

```


## 3.3 使用mixin来实现接口

```
{
  mixin("my_named")="com.sample.psi.impl.MyNamedImplMixin"
}
my_named ::= part1 part2 part3
// my_named ::= part1 part2 part3 {mixin="com.sample.psi.impl.MyNamedImplMixin"} // is a valid alternative


```


```
public class MyNamedImplMixin extends MyNamed implements PsiNamedElement {
  // methods from PsiNamedElement interface
  @Nullable @NonNls String getName() { ... }
  PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException { ... }
}
```

## 3.4 通过方法注入来实现接口

```
{
  psiImplUtilClass="com.sample.SamplePsiImplUtil"
  implements("my_named")="com.intellij.psi.PsiNamedElement"
}
my_named ::= part1 part2 part3 {
  methods=[getName setName]             // no need to specify arguments or return type
}
```

```
public class SamplePsiImplUtil {
  // methods from PsiNamedElement interface with an extra MyName parameter
  public static @Nullable String getName(MyNamed o) { ... }
  public static PsiElement setName(MyNamed o, @NotNull String name) throws IncorrectOperationException { ... }
}
```
## 3.5 Stub 索引支持
存根索引API对PSI类强制执行不同的合约：

+ 应该有一个手动编写的所谓的存根类
+ PSI节点类型应该扩展IStubElementType（与通常的IElementType相比）
+ PSI接口应该扩展StubBasedPsiElementBase
+ PSI实现类应该扩展StubBasedPsiElementBase

前两点不包括在生成器中。 IStubElementType以及存根类本身都应该小心地手工实现。 IStubElementType值可以通过elementTypeFactory属性提供给生成的解析器。

注意，最后一点可能会破坏extends属性所隐含的PSI继承。

剩下的问题可以通过两种方式解决。直接实现/mixin方法：


```
property ::= id '=' expr
  {
    implements=["com.sample.SampleElement" "com.intellij.psi.StubBasedPsiElement<com.sample.PropertyStub>"]
    mixin="com.sample.SampleStubElement<com.sample.PropertyStub>"

    // minimum requirements are:
    // implements=["com.intellij.psi.PsiElement" "com.intellij.psi.StubBasedPsiElement<com.sample.PropertyStub>"]
    // mixin="com.intellij.extapi.psi.StubBasedPsiElementBase<com.sample.PropertyStub>"
  }

```

stubClass-based方法:

```
property ::= id '=' expr
  {
    stubClass="com.sample.PropertyStub"
  }

```































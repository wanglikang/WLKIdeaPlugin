# bnf 中定义的关键字
见 grammar-kit 源码项目中的 KnownAttribute 类的声明
在 文法中可以的关键字有

+ extends 
+ implements 
+ elementType 
+ elementTypeClass
+ elementTypeFactory
+ pin
+ mixin
+ recoverWhile
  + 值一般取Quick Documention中的Follow，取个反即可
  + In most cases the predicate is "! FOLLOWS(rule)" and can be copied from the rule Quick Documentation
  + 参考：Grammar-Kit/resources/messages/attributeDescriptions/recoverWhile.html
+ name
+ extraRoot
+ rightAssociative
+ consumeTokenMethod
+ stubClass
+ methods
+ hooks



## 关于{name="规则名称xxx"}
  下一个期望输入的rule的first集合的终结符的个数
    当是1个的时候
      若 此rule 不是private 的，则展示的是此终结符的 "xxxx expected"，
      若此 rule 是private 的
        若配置了name属性，则展示的是自定义的name的值
        否则，展示的还是此终结符的 "xxxx expected"
 
    当有多个
      若配置了name，则展示name的值
      否则，展示rule 的自动生成的name





# 关于表达式 语法结构的坑
  对于 函数调用的表达式
```text
if(xyz)
    xxx(yy);
```
若把标识符的定义，放到表达式方法调用的最后
像下面这样
```text
expr::=
    other_expr
    | methodCall_expr
    | primary_expr
```

则会导致 在 methodCall_expr 这里一直组左递归，进而引起栈溢出

即 if( <函数调用的一部分> <函数调用的一部分> <函数调用的一部分> <函数调用的一部分> <函数调用的一部分> )

若把标识符的定义，放到表达式方法调用 的前面
像下面这样
```text
expr::=
    other_expr
    | primary_expr
    | methodCall_expr
```

则会导致 在 函数调用的方法名，被独自识别为一个 标识符 ，而不是一个 函数调用 的一部分

即

```text
if(xyz)
    identity(yy);
```


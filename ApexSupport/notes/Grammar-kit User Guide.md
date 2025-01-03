规则修饰语：
PSI tree：
	private
		跳过节点创建，并使子节点包含在其父节点里
	left
		将一个AST节点置于前一个兄弟节点的左侧，并将包围为他们的父节点
	inner
		将一个AST节点置于前一个兄弟节点的左侧，并将自身注入其中，成为AST的子节点
	upper
		选父节点，并将所有子节点纳入其中，并替换父节点
	fake
		用于对生成的PSI类进行整形的规则；仅生成PSI类。


Parser:
	meta
		一个参数化的规则，它的解析函数可以将另一个解析函数作为参数
	external
		一个用手写解析函数的规则，不会生成解析代码

规则修饰语可以互相结合，
但，inner仅可以和left结合
private left 等于 private left inner
fake 不能和private结合

默认的：规则（rule）是public的，如 non-private、non-faked等

元规则（Meta rules）和外部表达式（external expressions）

外部表达式<<...>> 是一个外部规则的内置变量

外部表达式和外部规则认为 单引号 的字符串和 双引号 的字符串是不同的
通常来说，在外部表达式中，规则或方法之后出现的任何东西都被认为是参数，并被传递过去，除非是单引号字符串，它们将先被去掉引号（这样能很好的传递枚举常量、java表达式等）

在参数列表中的规则饮用，将在GeneratedParserUtilBase.Parse实例中被实现


Token：
明确的token通过 全局token属性来声明，如 在 token_name=token_value的表格中
	token的name是IElementType类型的token常量，token的value是单引号或双引号的字符串表示
	语法中的toekn可以被使用单引号或双引号的name 或 value来饮用
	推荐使用value，因为可读性更好。当有一个未引号的token value在多个规则中匹配的时候，name可以用来作为解决冲突
隐含的token是那些不通过token属性指定的。
	未引用（Unquoted)的隐含token（又叫 关键字token）的name和value相同
	引用的隐含token（又叫文本匹配token）很慢，因为它们是通过文本匹配的，而不是通过词法分析器返回的IElementTYpe 常量匹配
	文本匹配的token能横跨词法分析器返回的多个真实的token

规则、token、文本匹配的token有不同的颜色



用于错误恢复的报告的属性
pin：值是一个数字或模式，
	将分析器转为 处理未完成的匹配
	如果一个序列的前缀和pin项匹配，则这个序列就匹配；在成功达到pinned项的时候，分析器尝试匹配剩余的项是否匹配。Pin的值通过 数字{pin=2} 或 模式{pin="rule_B"} 来表明期望的项
	默认情况下，pin应用到顶级的序列表达式。子表达式可以被使用一个目标表达式{pin("*")=1}来被包含，它可以应用到所有的子序列中

recoverWhile：值是一个预测规则，
	它将在规则匹配完成得到任何结果之后，匹配任意个数的token，
	当遇到未匹配到token序列的时候，这个属性帮助分析器进行恢复。参见【HOWTO section】

name：值是字符串
	指明在规则的错误报告中要使用的名字。例子：
	*name("_.expr")=expression 将改变表达式的错误信息从 不是一长串token 变为 "<expression> required"





生成的分析器结构
	生成器可以将分析代码拆分为几个类，为了对更大语法的更好支持
	在简单的情况下，一个分析器将仅有几个生成的类构成
	实际的错误恢复和报告代码 以及 基于分析器的补全提供者，提供代码和基本token匹配代码 ，在parserUtilClass 的类中

	可以通过指定其他继承或模仿原始GeneratedParseUtilBase类的方式，来修改它，不需要拷贝GeneratedParserUtilBase 类到项目中，自从12.1 版本后，它被内置到Intellij Platform中了

	手工的分析代码（如 外部规则），必须和生成的方式一样进行实现。在parseUtilClass中的静态代码或其他任何类中 ，可以通过parserImports属性进行导入

{
  parserImports=["static org.sample.ManualParsing.*"]
}




词法分析器和PSI
	通过分析器生成器生成的IElementType 常量 ，必须可以被词法分析器识别和返回。
	定义了所有被需要的token的语法，可以生成基于JFlex的词法分析器。（Generate JFlex Lexer 菜单）
	在*.flex 文件中 运行 JFlex Generator 菜单，调用JFlex 去生成生成器的java代码。关键字是从用法中拾取的，像字符串、标识符、注释的token可以像下面这样定义（从TUTORIAL）

{
  tokens=[
    ...
    comment='regexp://.*'
    number='regexp:\d+(\.\d*)?'
    id='regexp:\p{Alpha}\w*'
    string="regexp:('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")"
    ...
  ]
  ...
}


Live Preview 模式支持全java正则表达式的语法。JFlex仅支持Grammar-kit的子集，并会尝试一些明显的转换？？？？
词法分析器可以单独提供，或者使用生成的*.flex文件作为基础


默认情况下，分析器生成器产生token类型常量和 PSI
这可以通过对应的开关generateTokens、generatePSI来对应关闭
elementType 规则属性 允许混合生成的代码和其他已存在的手工的PSI

























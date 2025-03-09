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











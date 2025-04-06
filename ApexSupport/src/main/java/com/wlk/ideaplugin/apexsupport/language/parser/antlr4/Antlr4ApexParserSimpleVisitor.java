package com.wlk.ideaplugin.apexsupport.language.parser.antlr4;

import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;
import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexPsiType;
import com.wlk.ideaplugin.apexsupport.language.psi.ApexTokenType;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.consumeToken;

public class Antlr4ApexParserSimpleVisitor extends AbstractParseTreeVisitor<ParserRuleContext> {
    private int stack = 0;
    PsiBuilder builder;
    public Antlr4ApexParserSimpleVisitor(PsiBuilder b){
        this.builder = b;
    }


    @Override
    public ParserRuleContext visit(ParseTree tree) {
        if(tree instanceof  ParserRuleContext parserRuleContext){
            System.out.println("自定义visitor 遍历到："+parserRuleContext.toString());
            super.visit(tree);
            return parserRuleContext;
        }else{
            System.out.println("自定义visitor 遍历到未知的阶段："+tree.getClass().getSimpleName());
        }
        return null;
    }

    @Override
    public ParserRuleContext visitChildren(RuleNode node) {
        stack++;
        if(node instanceof ParserRuleContext ruleContextThis){
//            int elementIndex = ruleContextThis.start.getType();
            String text = ruleContextThis.getText();
            int ruleIndex = ruleContextThis.getRuleIndex();
            System.out.println("自定义visitor,开始遍历子节点，当前节点:"+stack+":"+makeTab(stack)+" "+ruleContextThis.getClass().getSimpleName() + " -> "+text);
            IElementType elementValueByIndex = ApexPsiType.getElementValueByIndex(2,ruleIndex);
            if(elementValueByIndex instanceof ApexTokenType tokenType){
                consumeToken(builder,tokenType);
            }
//            IElementType elementValueByIndex = null;
            PsiBuilder.Marker marker = null;
            if (builder!=null && elementValueByIndex != null){
                System.out.println("插入mark build start: "+stack+":"+ruleIndex+":"+ elementValueByIndex+ " -> "+elementValueByIndex.getDebugName());
                marker = enter_section_(builder, stack,_NONE_, elementValueByIndex,elementValueByIndex.getDebugName());
            }
            if(elementValueByIndex == null){
                System.out.println("未找到Rule:"+ruleIndex+" -> " +ruleContextThis.getAltNumber());
            }

            ParserRuleContext ruleContextChildrenAll = super.visitChildren(node);

            if (builder!=null && marker!=null){
                System.out.println("插入mark build end: "+stack+":"+ruleIndex+":"+ elementValueByIndex+ " -> "+elementValueByIndex.getDebugName());
                exit_section_(builder,stack,marker,true,false,null);
            }
            stack--;
            if(ruleContextChildrenAll == null){
                return (ParserRuleContext)node;
            }else{
                return ruleContextChildrenAll;
            }
        }else{
            System.out.println("未知的ruleNode："+node);
            stack--;
            return null;
        }
    }



    public String makeTab(int s){
        String t = "";
        for(int i = 0;i<s;i++){
            t =  t + "\t";
        }
        return t;
    }


}

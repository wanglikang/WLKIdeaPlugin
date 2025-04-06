//package com.wlk.ideaplugin.apexsupport.language.parser.antlr4;
//
//import com.intellij.lang.PsiBuilder;
//import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexParserBaseVisitor;
//import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.tree.RuleNode;
//
//@Deprecated
//public class Antlr4ApexParserVisitorAdapter extends ApexParserBaseVisitor<ParserRuleContext> {
//    PsiBuilder builder;
//    Antlr4ApexParserVisitorAdapter(PsiBuilder b){
//        this.builder = b;
//    }
//    @Override
//    public ParserRuleContext visitChildren(RuleNode node) {
//        if(node instanceof ParserRuleContext ruleContextThis){
//            System.out.println("ApexParserVisitorAdapter.visitChildren:"+ruleContextThis.getText());
//            ParserRuleContext ruleContextChildrenAll = super.visitChildren(node);
//            if(ruleContextChildrenAll == null){
//                return (ParserRuleContext)node;
//            }else{
//                return ruleContextChildrenAll;
//            }
//        }else{
//            return null;
//        }
//    }
//}

//package com.wlk.ideaplugin.apexsupport.language.parser;
//
//import com.intellij.lang.PsiBuilder;
//import com.intellij.lang.parser.GeneratedParserUtilBase;
//import com.intellij.psi.tree.IElementType;
//import com.wlk.ideaplugin.apexsupport.language.psi.ApexTokenType;
//
//import static com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes.*;
//
//@Deprecated
//public class ApexParserUtil extends GeneratedParserUtilBase {
//
//
//    public static boolean assertDotCall(PsiBuilder builder, int level) {
//        // 避免下面的情况引起的死循环
//        // xxxx(
//        // xxxx)
//        // xxxx;
//        // xxxx.
//        IElementType currentToken = builder.rawLookup(0);
//        IElementType nextToken = builder.rawLookup(1);
//        if(currentToken == IDENTIFIER ){
//            if (nextToken  == LPAREN || nextToken== RPAREN || nextToken == SEMI || nextToken == DOT || nextToken == COMMA) {
//                System.out.println(level+":use_for_debug:"+appendXTab(level) + "提前结束左递归: => "+currentToken.getDebugName()+ " "+nextToken.getDebugName());
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean use_for_debug(PsiBuilder builder, int level,String arg) {
//        if(level > 100){
//            return false;
//        }
//        StringBuffer sb = new StringBuffer();
//        for(int i = -5;i < 0 ;i++){
//            IElementType iElementType = builder.rawLookup(i);
//            if(iElementType instanceof ApexTokenType) {
//                ApexTokenType apexEle  = (ApexTokenType)iElementType;
//                sb.append(apexEle.getDebugName()+" ");
//            }
//        }
//        System.out.println(level+":use_for_debug:"+appendXTab(level)+arg+" "+sb+" => "+builder.getTokenText());
////        parseAsTree(GeneratedParserUtilBase.ErrorState.get(builder), builder, level + 1, DUMMY_BLOCK, true, TOKEN_ADVANCER, condition);
//        return true;
//    }
//
//    // 提前判断是否为一个单独的标识符，用在表达式中
//    public static boolean advanceIdentifierOrLiteral(PsiBuilder builder, int level) {
//        IElementType currEle = builder.rawLookup(0);
//        if(currEle == IDENTIFIER  || currEle == LITERAL) {
//            IElementType nextEle = builder.rawLookup(1);
//            return builder.isWhitespaceOrComment(nextEle);
//        }
//        return false;
//    }
//
//
//    public static String appendXTab(int x){
//        // 重复\t x次
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0;i<x;i++){
//            sb.append("\t");
//        }
//        return sb.toString();
//    }
//}

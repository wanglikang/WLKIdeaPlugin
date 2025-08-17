//package com.wlk.ideaplugin.apexsupport.util;
//
//
//import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexParser;
//import org.antlr.v4.runtime.Vocabulary;
//
//import java.io.*;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Antlr4Util {
//    public static void main(String[] args) throws IOException {
//        File t = new File("abc.txt");
//        System.out.println("abs path:");
//        System.out.println(t.getAbsolutePath());
//        // /Users/bytedance/GithubProjects/WLKIdeaPlugin./ApexSupport/src/main/gen/com/wlk/ideaplugin/apexsupport/language/antlr4/ApexParser.tokens
//        FileReader fileReader = new FileReader("./ApexSupport/src/main/gen/com/wlk/ideaplugin/apexsupport/language/antlr4/ApexParser.tokens");
//        BufferedReader  reader = new BufferedReader(fileReader);
//
//        FileWriter resultWriter = new FileWriter("./ApexSupport/src/main/gen/com/wlk/ideaplugin/apexsupport/language/antlr4/ApexPsiType.java");
//        BufferedWriter  writer = new BufferedWriter(resultWriter);
//
//
//
//        writer.write("package com.wlk.ideaplugin.apexsupport.language.antlr4;\n" +
//                "\n" +
//                "import com.intellij.psi.tree.IElementType;\n" +
//                "import com.intellij.psi.PsiElement;\n" +
//                "import com.intellij.lang.ASTNode;\n" +
//                "import com.wlk.ideaplugin.apexsupport.language.psi.ApexElementType;\n" +
//                "import com.wlk.ideaplugin.apexsupport.language.psi.ApexTokenType;\n" +
//                "import java.util.*;\n" +
//                "\n" +
//                "public class ApexPsiType {\n");
//        writer.newLine();
//        writer.write("\tMap<Integer,String> tokenMap = new HashMap<>();\n" +
//                "\tMap<Integer,String> ruleMap = new HashMap<>();\n");
//
//
//
//
//        Map<Integer,String> tokenMap = new HashMap<>();
//        Map<Integer,String> ruleMap = new HashMap<>();
////        while(reader.ready()){
////            String s = reader.readLine();
////            int i = s.lastIndexOf("=");
////            if(s.startsWith("'")) {
////                // 是 token
////                String tokenText = s.substring(1, i - 1);
////                String tokenIndex = s.substring(i + 1);
////                String tokenDefineName = tokenText;
////                System.out.println(tokenText + " => " + tokenIndex);
////                if(!StringUtils.isAlpha(tokenText)){
////                    tokenDefineName  = "TOKEN_"+tokenIndex;
////                }else{
////                    tokenDefineName  = "TOKEN_"+tokenText;
////                }
////                writer.write("\tpublic static IElementType "+tokenDefineName+" \t= ApexTokenType.createTokenType(\""+tokenText+"\");\n");
////                tokenMap.put(Integer.parseInt(tokenIndex),tokenDefineName);
////            }else{
////                // 是 文法符号
////                String ruleText = s.substring(0, i);
////                String ruleIndex = s.substring(i + 1);
////                String ruleDefineName = ruleText;
////                System.out.println(ruleText + " => " + ruleIndex);
////                writer.write("\tpublic static IElementType "+ruleDefineName+" \t= new ApexElementType(\""+ruleText+"\");\n");
////                ruleMap.put(Integer.parseInt(ruleIndex),ruleDefineName);
////            }
////        }
////        
//
//        ApexParser apexParser = new ApexParser(null);
//        String[] ruleNames = apexParser.getRuleNames();
//        // 文法符号
//        for(int ruleIndex = 0;ruleIndex<ruleNames.length;ruleIndex++){
//            String ruleDefineName = ruleNames[ruleIndex];
//            writer.write("\tpublic static IElementType "+ruleDefineName+" \t= new ApexElementType(\""+ruleDefineName+"\");\n");
//            ruleMap.put(ruleIndex,ruleDefineName);
//        }
//        writer.newLine();
//        Vocabulary vocabulary = ApexParser.VOCABULARY;
//        int maxTokenType = vocabulary.getMaxTokenType();
//        //Token 定义
//        for (int tokenIndex = 0; tokenIndex < maxTokenType; tokenIndex++) {
//            String tokenDefineName = vocabulary.getSymbolicName(tokenIndex);    // 在文法中的定义标识符
//            String tokenDisplayName = vocabulary.getDisplayName(tokenIndex);
//            if(tokenDefineName == null) {
//                tokenDefineName =  vocabulary.getLiteralName(tokenIndex);       //token的字面量
//            }
//            tokenDefineName = "TOKEN_"+tokenDefineName;
//            writer.write("\tpublic static IElementType "+tokenDefineName+"\t= ApexTokenType.createTokenType(\""+tokenDisplayName+"\");\n");
//
//            tokenMap.put(tokenIndex,tokenDefineName);
//        }
//
//        writer.newLine();
//        writer.write("\n");
//
//        writer.write("\tpublic static IElementType getElementValueByIndex(int type,int index){\n");
//        writer.write("\t\tif(type == 1){\n");
//        writer.write("\t\t\tswitch (index){\n");
//            for (Map.Entry<Integer, String> entry : tokenMap.entrySet()) {
//                Integer index = entry.getKey();
//                String name = entry.getValue();
//                writer.write("\t\t\t\tcase "+index+":return "+name+";\n");
//            }
//            writer.write("\t\t\t\tdefault:return null;\n");
//        writer.write("\t\t\t}\n");
//
//        writer.write("\t\t} else {\n");
//        writer.write("\t\t\tswitch (index){\n");
//            for (Map.Entry<Integer, String> entry : ruleMap.entrySet()) {
//                Integer index = entry.getKey();
//                String name = entry.getValue();
//                writer.write("\t\t\t\tcase "+index+":return "+name+";\n");
//            }
//            writer.write("\t\t\tdefault:return null;\n");
//        writer.write("\t\t}\n");
//        writer.write("\t}\n}\n");
//
//        writer.write("}");
//
//        writer.flush();
//        writer.close();
//    }
//}

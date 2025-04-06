//package com.wlk.ideaplugin.apexsupport.language.parser.antlr4;
//
//import com.intellij.lang.ASTNode;
//import com.intellij.lang.LightPsiParser;
//import com.intellij.lang.PsiBuilder;
//import com.intellij.lang.PsiParser;
//import com.intellij.lang.impl.PsiBuilderImpl;
//import com.intellij.lang.parser.GeneratedParserUtilBase;
//import com.intellij.lexer.Lexer;
//import com.intellij.psi.tree.IElementType;
//import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexParser;
//import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexParserBaseListener;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.jetbrains.annotations.NotNull;
//
//public class Antlr4ParserAdapter implements PsiParser, LightPsiParser {
//    org.antlr.v4.runtime.Parser parser;
//    public Antlr4ParserAdapter() {
//        this.parser =  new com.wlk.ideaplugin.apexsupport.language.antlr4.ApexParser(null);
//    }
//
//    @Override
//    public @NotNull ASTNode parse(@NotNull IElementType root, @NotNull PsiBuilder builder) {
//        Lexer lexer = ((PsiBuilderImpl) builder).getLexer();
//        Antlr4Lexer antlr4Lexer = (Antlr4Lexer) lexer;
////        // 若直接获取，可能获取的token是空的
////        // 在语法分析器中，手动调用进行词法分析
////        System.out.println("开始手动调用Lexer读取token...");
////        antlr4Lexer.advance();
////        IElementType tokenType = antlr4Lexer.getTokenType();
////        while(tokenType != null) {
////            tokenType = antlr4Lexer.getTokenType();
////        }
////
//
//        // 方式1:直接使用lexer，并重置
//        antlr4Lexer.lexer.reset();
//        System.out.println("手动重置了lexer");
//        CommonTokenStream commonTokenStream = new CommonTokenStream(antlr4Lexer.lexer);
//        this.parser.setTokenStream(commonTokenStream);
//        this.parser.reset();
//        // 添加listener
//        this.parser.addParseListener(new ApexParserBaseListener());
//
//
//
//        // 方式2:使用lexer解析后的token
////        List<Token> allTokens = antlr4Lexer.getAllToken();
////        System.out.println("结束手动调用Lexer，读取到 "+allTokens.size()+" 个token");
////        AfterLexerTokenSource afterLexerTokenSource = new AfterLexerTokenSource(allTokens);
////        this.parser.setTokenStream(afterLexerTokenSource);
//
//
//        parseLight(root, builder);
//        ASTNode treeBuilt = builder.getTreeBuilt();
//        return treeBuilt;
//    }
//
//    @Override
//    public void parseLight(IElementType t, PsiBuilder b) {
//        boolean r = false;
//        b = GeneratedParserUtilBase.adapt_builder_(t, b, this);
//
////        PsiBuilder.Marker m = GeneratedParserUtilBase.enter_section_(b, 0, GeneratedParserUtilBase._COLLAPSE_, null);
//
//        ApexParser.ApexFileContext apexFileContext = ((ApexParser) parser).apexFile();
//        ParseTree parseTree = (ParseTree)apexFileContext;
//        String text = parseTree.getText();
//        System.out.println("parseTree is:");
//        System.out.println(text);
//
//
//        Antlr4ApexParserSimpleVisitor apexParserVisitor = new Antlr4ApexParserSimpleVisitor(b);
//        apexParserVisitor.visit(apexFileContext);
//
//
////        PsiTreeUtil psiTreeUtil = new PsiTreeUtil();
////        PsiUtilCore psiUtilCore = new PsiUtilCore();;
////        GeneratedParserUtilBase.exit_section_(b, 0, m, t, r, true, GeneratedParserUtilBase.TRUE_CONDITION);
//    }
//}
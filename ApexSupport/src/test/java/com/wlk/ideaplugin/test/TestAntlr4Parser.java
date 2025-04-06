package com.wlk.ideaplugin.test;

import com.wlk.ideaplugin.apexsupport.language.parser.antlr4.Antlr4ApexParserSimpleVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestAntlr4Parser {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/bytedance/IdeaProjects/test_for_plugin/src/main/java/org/example/TestClass.cls";
        File file = new File(filePath);
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        StringBuffer sb = new StringBuffer();
        while (fileReader.ready()) {
            String s = fileReader.readLine();
            sb.append(s).append("\n");
        }
        CodePointCharStream codePointCharStream = CharStreams.fromString(sb.toString(), "");
        ApexLexer lexer = new ApexLexer(codePointCharStream);
        lexer.reset();
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
//        List<? extends Token> allTokens = lexer.getAllTokens();
//        System.out.println("所有的token：");
//        for (Token token : allTokens) {
//            System.out.print(token.getText());
//        }
//        System.out.println("========");
//        AfterLexerTokenSource afterLexerTokenSource = new AfterLexerTokenSource(new ArrayList<>(allTokens));

        ApexParser apexParser = new ApexParser(commonTokenStream);



        ApexParser.ApexFileContext apexFileContext = apexParser.apexFile();
        String stringTree = apexFileContext.toStringTree();
        System.out.println("语法解析的结果："+stringTree  );
        ParseTree parseTree = (ParseTree)apexFileContext;
        String text = parseTree.getText();

        Antlr4ApexParserSimpleVisitor apexParserVisitor = new Antlr4ApexParserSimpleVisitor(null);
        apexParserVisitor.visit(apexFileContext);


    }
}

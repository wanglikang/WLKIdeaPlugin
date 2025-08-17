//package com.wlk.ideaplugin.apexsupport.language.parser.antlr4;
//
//import com.intellij.lexer.LexerBase;
//import com.intellij.psi.TokenType;
//import com.intellij.psi.tree.IElementType;
//import com.wlk.ideaplugin.apexsupport.language.antlr4.ApexPsiType;
////import com.wlk.ideaplugin.apexsupport.language.gen.psi.ApexTypes;
//import com.wlk.ideaplugin.apexsupport.language.psi.ApexTokenType;
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CodePointCharStream;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.Token;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Antlr4Lexer extends LexerBase {
//
//
//    public org.antlr.v4.runtime.Lexer lexer;
//    public Antlr4Lexer(org.antlr.v4.runtime.Lexer lexer) {
//        System.out.println("创建Lexer:");
//        this.lexer = lexer;
//    }
//
//    int startOffset = 0;
//    int endOffset = 0;
//    //    int initialState = 0;
//    CommonTokenStream tokenStream;
//    CharSequence myText;
//
//    @Override
//    public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
//
//        this.myText = buffer;
//        String inputSequence = buffer.toString();
//        System.out.println("初始化Lexer:");
//        System.out.println(inputSequence);
//        // 方式1
////        ANTLRInputStream input = new ANTLRInputStream(inputSequence);
////        lexer = new ApexLexer(input);
//
//        // 方式2
//        CodePointCharStream codePointCharStream = CharStreams.fromString(inputSequence, "");
//        lexer = new ApexLexer(codePointCharStream);
//
//        this.startOffset = startOffset;
//        this.endOffset = endOffset;
////        this.initialState = initialState;
//        lexer.setState(initialState);
//        tokenStream = new CommonTokenStream(lexer);
//        // 开启后就要获取一下token
//        Token token = lexer.nextToken();
//    }
//
//    @Override
//    public int getState() {
//        return lexer.getState();
//    }
//
//    @Override
//    public @Nullable IElementType getTokenType() {
//        Token token = lexer.getToken();
//        if(token.getText().equals("<EOF>") || token.getType()==-1){
//            System.out.println("找到文件末尾了");
//            return null;
//        }
//
//        int startIndex = token.getStartIndex();
//        int stopIndex = token.getStopIndex();
//        int tokenIndex = token.getTokenIndex();
////        int type = token.getType();
//        int line = token.getLine();
//        int col = token.getCharPositionInLine();
//        String text = token.getText();
//        //TODO 对token进行特殊处理
//        // 如，表示whitespace类型的token、注视类型的token等
//        if(isWhiteSpace(token)){
//            return TokenType.WHITE_SPACE;
//        }else if(isComment(token)){
//            // return ApexTypes.COMMENT;
//            return ApexTypes.LINE_COMMENT;
//        }
//        // 这里不能每次都new，应该提前声明好
////        ApexTokenType tokenType = getTokenType(token.getType(), text, line, col);
//        IElementType elementValueByIndex = ApexPsiType.getElementValueByIndex(1, token.getType());
////        System.out.println("getTokenType,\t当前token是:\t" + token.getText()+"\t,startIndex:"+startIndex+",stopIndex:"+ stopIndex +",tokenIndex:"+tokenIndex);
//        System.out.println("getTokenType.结果：,\t当前token是:\t" + elementValueByIndex.getDebugName());
//        return elementValueByIndex;
//    }
//
//    //缓存的全局唯一的tokenType
//    Map<Integer,ApexTokenType> cachedTokenTypeMap = new HashMap<>();
//    //加锁访问
//    public synchronized ApexTokenType  getTokenType(int type,String text,int line,int col) {
//        if(cachedTokenTypeMap.containsKey(type)){
//            System.out.println("getTokenType.使用缓存的tokenType:"+type+" -> "+text);
//            return cachedTokenTypeMap.get(type);
//        }
//        ApexTokenType value = new ApexTokenType(text, line, col, type);
//        cachedTokenTypeMap.put(type, value);
////        System.out.println("getTokenType.创建了新tokenType:"+type+" -> "+text);
//        return value;
//    }
//
//    public boolean isWhiteSpace(Token token){
//        int channel = token.getChannel();
//        String[] channelNames = lexer.getChannelNames();
//        for(int i = 0;i<channelNames.length;i++){
//            if(channel == i && "WHITESPACE_CHANNEL".equals(channelNames[i])){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean isComment(Token token){
//        int channel = token.getChannel();
//        String[] channelNames = lexer.getChannelNames();
//        for(int i = 0;i<channelNames.length;i++){
//            if(channel == i && "COMMENT_CHANNEL".equals(channelNames[i])){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public int getTokenStart() {
//
//        //TODO 还需要知道确切的作用
//        //用来定位token的具体位置，应该是在CharSequence 中的确切位置
//        Token token = lexer.getToken();
//        if(token == null) {
//            System.out.println("未匹配到token start");
//            return 0;
//        }
//        int startIndex = token.getStartIndex();
//        int stopIndex = token.getStopIndex();
//        int tokenIndex = token.getTokenIndex();
////        System.out.println("getTokenStart,\t当前token是:\t" + token.getText()+"\t,startIndex:"+startIndex+",stopIndex:"+ stopIndex +",tokenIndex:"+tokenIndex);
//
//        return startIndex;
////        return lexer.getCharIndex();
////        return 0;
//    }
//
//    @Override
//    public int getTokenEnd() {
//        Token token = lexer.getToken();
//        if(token == null) {
//            System.out.println("未匹配到token end");
//            return 0;
//        }
//        int startIndex = token.getStartIndex();
//        int stopIndex = token.getStopIndex();
//        int tokenIndex = token.getTokenIndex();
////        System.out.println("getTokenEnd,\t当前token是:\t" + token.getText()+"\t,startIndex:"+startIndex+",stopIndex:"+stopIndex+",tokenIndex:"+tokenIndex);
//        // 即返回当前token结束的位置，不包含（即结束的下一位的下标）
//        return stopIndex + 1;
//    }
//
//    @Override
//    public void advance() {
//        Token token = lexer.nextToken();
//        int startIndex = token.getStartIndex();
//        int stopIndex = token.getStopIndex();
//        int tokenIndex = token.getTokenIndex();
//        System.out.println("advance,\t当前token是:\t【" + token.getText()+"】\t,startIndex:"+startIndex+",stopIndex:"+stopIndex+",tokenIndex:"+tokenIndex);
//        //额外添加到list里，供后续的 语法分析使用
//
//        innerTokenList.add(token);
//    }
//
//    @Override
//    public @NotNull CharSequence getBufferSequence() {
//        return myText;
//    }
//
//    @Override
//    public int getBufferEnd() {
//        return endOffset;
//    }
//
//    public List<Token> innerTokenList = new ArrayList<>();
//    public List<Token> getAllToken(){
//        return innerTokenList;
//    }
//}

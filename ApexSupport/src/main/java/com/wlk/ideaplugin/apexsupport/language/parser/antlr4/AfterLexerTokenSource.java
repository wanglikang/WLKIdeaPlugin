//package com.wlk.ideaplugin.apexsupport.language.parser.antlr4;
//
//import org.antlr.v4.runtime.*;
//import org.antlr.v4.runtime.misc.Interval;
//
//import java.util.ArrayList;
//import java.util.List;
//
//// 为了兼容antlr4，新建一个token的容器，用来存放经过lexer处理后识别到的token们
//// 并模拟stream
//// 因为 antlr4貌似的边进行lexer，边进行语法分析，，但是idea内部是先进行词法分析，再进行语法分析
//// 原始的lexer的 TokenStream 无法匹配
//@Deprecated
//public class AfterLexerTokenSource implements TokenStream {
//
//    ArrayList<Token> bufferdTokenList = new ArrayList<>();
//    int currentIndex = 0;
//
//    public AfterLexerTokenSource(List<Token> tokens){
//        System.out.println("初始化tokenSource:"+tokens.size());
//        bufferdTokenList.addAll(tokens);
//    }
//    @Override
//    public Token LT(int k) {
//        int targetIndex = currentIndex + k;
//        if(targetIndex >= bufferdTokenList.size()){
//            System.out.println("tokensource 中的 LT异常:,当前currentIndex："+currentIndex+" ,index=> "+k+" tokenList.size():"+bufferdTokenList.size());
//            return null;
//        }
//        if(targetIndex<0){
//            System.out.println("tokensource 中的 LT异常:,当前currentIndex："+currentIndex+" ,index=> "+k+" tokenList.size():"+bufferdTokenList.size());
//            return null;
//        }
//        Token token = bufferdTokenList.get(targetIndex);
//        System.out.println("tokensource 中的 LT:,当前currentIndex："+currentIndex+",index=> "+k+" => "+token.getText());
//        return token;
//    }
//
//    @Override
//    public Token get(int index) {
//        return bufferdTokenList.get(index);
//    }
//
//    public TokenSource myTokenSource = new InnerTokenSource();
//    @Override
//    public TokenSource getTokenSource() {
//        //TODO  待完善
//        System.out.println("获取tokenSource，暂未实现");
//        return myTokenSource;
//    }
//
//    @Override
//    public String getText(Interval interval) {
//        return "暂未实现，结果应该是 "+ interval+ " 间隔的全部token";
//    }
//
//    @Override
//    public String getText() {
//        return "暂未实现，结果应该是 0 间隔的全部token";
//    }
//
//    @Override
//    public String getText(RuleContext ctx) {
//        return "暂未实现，结果应该是 更细致展示效果 的全部token";
//    }
//
//    //在语法解析报错的时候，会调用这个函数
//    @Override
//    public String getText(Token start, Token stop) {
//        StringBuffer sb = new StringBuffer();
//
//        for(int i = start.getStartIndex();i<stop.getStopIndex();i++){
//            Token token = bufferdTokenList.get(i);
//            sb.append(token.getText());
//        }
//        return sb.toString();
//    }
//
//    @Override
//    public void consume() {
//        System.out.println("tokensource 中的 consume,当前index："+currentIndex+" 自增");
//        currentIndex++;
//
//    }
//
//    // lookahead？？
//    @Override
//    public int LA(int i) {
//        // 返回的是toke 的type
//        Token lt = LT(i);
//        if(lt == null){
//            System.out.println("tokensource 中的 LA,当前的 token 为null");
//            return -1;
//        }
//        int type = lt.getType();
//        System.out.println("tokensource 中的 LA,当前的 token 的type："+type);
//        return type;
//    }
//
//    @Override
//    public int mark() {
//        // do nothing
//        System.out.println("tokensource 中的 mark, do nothing");
//        return -1;
//    }
//
//    @Override
//    public void release(int marker) {
//        //do nothing
//        System.out.println("tokensource 中的 release, do nothing");
//    }
//
//    @Override
//    public int index() {
//        System.out.println("tokensource 中的 index,当前的Index："+currentIndex);
//        return currentIndex;
//    }
//
//    @Override
//    public void seek(int index) {
//        currentIndex = index;
//        System.out.println("tokensource 中的 seek,简单设置currentIndex = index:"+index);
//    }
//
//    @Override
//    public int size() {
//        System.out.println("tokensource 中的 size : "+bufferdTokenList.size() +1);
//        return bufferdTokenList.size() +1;
//    }
//
//    @Override
//    public String getSourceName() {
//        return "暂无实现，应该返回此source的名称";
//    }
//}

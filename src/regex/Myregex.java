package regex;

import java.util.regex.*;

class RegexExample1{
    public static void main(String[] args){
//        String skuName = "今麦郎大今野老坛酸菜牛肉面新老包装随机 108g*24袋/箱";
        //今麦郎大今野老坛酸菜牛肉面新老包装随机108g*24袋
        String skuName = "今麦郎大今野香辣牛肉面101g*24袋/箱";
        //今麦郎大今野香辣牛肉面101g*24袋
        //括号统一
        Pattern leftBracketPattern  =  Pattern.compile("[（|【|\\[]");
        Matcher leftBracketMatcher  =  leftBracketPattern.matcher(skuName);
        skuName = leftBracketMatcher.replaceAll("(");

        Pattern rightBracketPattern  =  Pattern.compile("[）|】|\\]]");
        Matcher rightBracketMatcher  =  rightBracketPattern.matcher(skuName);
        skuName = rightBracketMatcher.replaceAll(")");

        // 空白去除
        Pattern blankPattern  =  Pattern.compile("\\s");
        Matcher blankMatcher  =  blankPattern.matcher(skuName);
        skuName = blankMatcher.replaceAll("");

        // 末尾规格词去除
        Pattern smggPattern  =  Pattern.compile("/*[箱|袋|瓶|份]$");
        Matcher smggMatcher  =  smggPattern.matcher(skuName);
        skuName = smggMatcher.replaceAll("");

        System.out.println(skuName);


    }
}
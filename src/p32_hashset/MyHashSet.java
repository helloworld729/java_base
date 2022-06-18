package p32_hashset;

import java.util.HashSet;
/*
* 增加：add
* 删除：remove
* 查找：contains
* 长度：size
* */
public class MyHashSet {
    public static void main(String[] args){
        System.out.println("initialize and add elements to hashset");
        HashSet<String> sites = new HashSet<String>();

        sites.add("baidu");
        sites.add("meituan");
        System.out.println(sites+"\n");

        System.out.println("remove element");
        sites.remove("baidu");
        System.out.println(sites + "\n");

        System.out.println("if contains alibaba: " + sites.contains("alibaba") + "\n");

        sites.add("baidu");

        System.out.println("size: " + sites.size());

        System.out.println("for each");
        for(String s: sites){
            System.out.println(s);
        }

    }
}

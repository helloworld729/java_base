package p33_hashmap;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> sites = new HashMap<Integer, String>();

        // 增
        sites.put(1, "baidu");
        sites.put(2, "alibaba");
        sites.put(3, "tencent");

        // 遍历
        sites.forEach((key, value) -> {
            System.out.println(key +  ": " + value);
        });
        System.out.println(sites.keySet());
        System.out.println(sites.values());

        // 删
        System.out.println("\n");
        System.out.println("afer del 1");
        sites.remove(1);
        System.out.println(sites);

        // 改
        System.out.println("\n");
        System.out.println("afer replace 3");
        sites.replace(3, "meituan");
        System.out.println(sites);

        //查
        System.out.println("\n");
        System.out.println("afer search 2");
        System.out.println(sites.get(2));
    }
}

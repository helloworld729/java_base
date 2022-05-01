package p30_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args){
        // 动态数组初始化
        ArrayList<String> sites = new ArrayList<String>();  // 类型必须是引用类型/封装类型

        // 增加元素-add
        System.out.println("增加元素-add");
        sites.add(0,"baidu");
        sites.add(0, "xinlang");  // 指定索引添加
        sites.add(0, "weibo");
        sites.add("google"); // 同 append

        System.out.println(sites);
        // 查找元素-get：基于索引查找
        System.out.println("查找index=1:");
        System.out.println(sites.get(1));
        // 查找索引-indexof：基于内容查找索引，没有时返回-1
        System.out.println("查找weibo的索引");
        System.out.println(sites.indexOf("weibo"));
        System.out.println("查找hello的索引");
        System.out.println(sites.indexOf("hello"));
        // 判断是否存在
        System.out.println("判断hello是否存在");
        System.out.println(sites.contains("hello"));

        // 修改元素-set
        sites.set(1, "hahaha");
        System.out.println("将索引=1的位置，元素修改为hahaha");
        System.out.println(sites.get(1)+"\n");

        // 删除元素-remove：根据索引删除
        System.out.println("删除元素-remove：根据索引删除");
        System.out.println(sites);
        sites.remove(1);
        System.out.println(sites);
        System.out.println("删除元素-removeIf：根据条件删除");
        sites.removeIf(e -> e == "google");  // reda more about java lambda
        System.out.println(sites+"\n");

        // Iteration
        System.out.println("Iteration + sort:");
        ArrayList<Integer> nums = new ArrayList<Integer>();  // <>
        nums.add(5);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        System.out.println("size: " + nums.size());

        System.out.println("before sort");
        for(int j: nums){
            System.out.println(j);
        }

        Collections.sort(nums);

        System.out.println("after sort");
        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }

    }
}

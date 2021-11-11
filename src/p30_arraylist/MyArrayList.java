package p30_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args){
        ArrayList<String> sites = new ArrayList<String>();  // <>
        sites.add(0,"baidu");
        sites.add(0, "xinliang");  // 增
        sites.add(0, "weibo");
        System.out.println(sites);
        System.out.println(sites.get(1));  // 查

        sites.set(1, "hahaha");   // 改
        System.out.println(sites.get(1));

        sites.remove(1); // 删
        System.out.println(sites.get(1));

        ArrayList<Integer> nums = new ArrayList<Integer>();  // <>
        nums.add(5);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        System.out.println("size: " + nums.size());

        for(int j: nums){
            System.out.println(j);
        }

        Collections.sort(nums);
        System.out.println(nums);

    }
}

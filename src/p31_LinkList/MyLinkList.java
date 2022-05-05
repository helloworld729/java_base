package p31_LinkList;

import java.util.LinkedList;

public class MyLinkList {
    public static void main(String[] args){
        LinkedList<String> sites = new LinkedList<String>();
        // 链表初始化与 增加元素
        System.out.println("## initialize and Add elements:");
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites+"\n");
        sites.set(1, "hello");

        // 在头部增加、删除、查找比linklist更加高效
        System.out.println("## add element in first or last");
        sites.addFirst("first_site");
        sites.addLast("last_site");
        System.out.println(sites + "\n");

        System.out.println("## remove element in first or last");
        sites.removeFirst();
        sites.removeLast();
        System.out.println(sites + "\n");

        System.out.println("## get element in first or last");
        System.out.println(sites.getFirst() + "\t" + sites.getLast() + "\n");

        // 链表遍历
        System.out.println("for each:");
        for (String s: sites){
            System.out.println(s);
        }
    }
}

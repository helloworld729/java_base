package p12_string_buffer;

public class MyStringBuffer {
    public static void main(String[] args){
        System.out.println("string builder 类");
        StringBuilder sb = new StringBuilder(10); // 可以用容量初始化，也可以直接用字符串初始化

        System.out.println("尾部增加操作-append：增加 knight到空栈");
        sb.append("Knight ");
        System.out.println(sb);
        System.out.println("\n");

        System.out.println("根据索引插入-insert：在尾部插入字符");
        sb.insert(7, "is learning java....");
        System.out.println(sb);
        System.out.println("\n");

        System.out.println("根据索引删除-delete：删除尾部的.");
        sb.delete(25, 25+2);
        System.out.println(sb);
        System.out.println("\n");

        System.out.println("根据索引修改-replace：java 修改为change"); // 先删除再插入
        sb.replace(19, 23, "change");  // 右开区间，如果右区间等于左区间，等价于插入操作
        System.out.println(sb);
        System.out.println("\n");

        System.out.println("根据索引修改单个字符-setCharAt：修改首字母为K");
        sb.setCharAt(0, 'K');
        System.out.println(sb);
        System.out.println("\n");

        System.out.println("\nstring buffer 类");
        StringBuffer sf = new StringBuffer("Hello World");  // 初始化原则同builder
        System.out.println(sf);

        sf.append("...");
        System.out.println(sf);
    }
}

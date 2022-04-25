package p12_string_buffer;

public class MyStringBuffer {
    public static void main(String[] args){
        System.out.println("string builder class");
        StringBuilder sb = new StringBuilder(10); // 可以用容量初始化，也可以直接用字符串初始化
        sb.append("Knight ");
        System.out.println(sb);

        sb.insert(7, "is learning java....");
        System.out.println(sb);

        sb.delete(25, 25+2);
        System.out.println(sb);

        System.out.println("\nstring buffer class");
        StringBuffer sf = new StringBuffer("Hello World");  // 初始化原则同builder
        System.out.println(sf);

        sf.append("...");
        System.out.println(sf);
    }
}

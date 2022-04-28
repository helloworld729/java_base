package p11_string;

public class MyString {
    public static void main(String[] args){
        // 初始化方法 + 相等判断
        String s0 = "hello world";  // 公共池初始化
        String s1 = "hello world";
        String s2 = new String("hello world");  // 堆初始化
        String s3 = new String("hello world");

        System.out.println(s0 == s1);  // true 引用地址相同
        System.out.println(s2 == s3);  // false 地址不同

        System.out.println(s1.equals(s2));  // true  内容相同即可
        System.out.println(s1 == s2);       // false 比较内容和地址，和python中==不同，和python的is相同

//        s1 = "redefinition";
//        System.out.println(s1);  // string 底层使用基于final修饰的char数组实现，s1这里是引用类型，可以指向不同的string

        // 长度
        System.out.println(s1.length());

        // 分割 split
        String str = new String("Welcome to Runoob");
        System.out.println("- 分隔符返回值 :" );
        for (String retval: str.split("\\s+")){
            System.out.println(retval);
        }
        System.out.println("\n");

        // 拼接 concat
        System.out.println("concat方法：");
        System.out.println("hello".concat("_world"));
        System.out.println("\n");

        // 基于索引访问字符 indexOf
        System.out.println("indexOf方法：");
        System.out.println("hello".indexOf("l"));
        System.out.println("\n");

        // 基于字符查找索引 charAt
        System.out.println("charAt方法");
        System.out.println("hello".charAt(2));
        System.out.println("\n");

        // 大小写 toUpperCase/toLowerCase
        System.out.println("upperCase方法");
        System.out.println("hello".toUpperCase());
        System.out.println("\n");

        // format：数值型 + 字符型
        System.out.println("format方法");
        System.out.println(String.format("%05.1f 是一个浮点数 \n" +
                                         "%+,3d", 1.23f, -123456));  // % 【标识】 宽度.小数位数 【转换格式】
        System.out.println(String.format("%-5s %-5s", "你好", "hello"));  // % 【标识】 宽度.小数位数 【转换格式】
        System.out.println(String.format("%-5s %-5s", "世界", "world"));  // % 【标识】 宽度.小数位数 【转换格式】
        System.out.println("\n");
    }
}

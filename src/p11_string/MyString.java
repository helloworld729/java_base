package p11_string;

public class MyString {
    public static void main(String[] args){
        // 创建方法+相等判断
        String s0 = "hello world";
        String s1 = "hello world";
        String s2 = new String("hello world");
        String s3 = new String("hello world");

        System.out.println(s0 == s1);
        System.out.println(s2 == s3);

        System.out.println(s1.equals(s2));  // 比较内容
        System.out.println(s1 == s2);       // 比较内容和地址，和python中==不同，和python的is相同

//        s1 = "redefinition";
//        System.out.println(s1);  // string 底层使用基于final修饰的char数组实现，s1这里是引用类型，可以指向不同的string

        // 长度
        System.out.println(s1.length());

        // 分割
        String str = new String("Welcome to Runoob");
        System.out.println("- 分隔符返回值 :" );
        for (String retval: str.split("\\s+")){
            System.out.println(retval);
        }

        // 拼接
        System.out.println("hello".concat("_world"));

        // 字符的索引
        System.out.println("hello".indexOf("l"));

        // 索引的字符
        System.out.println("hello".charAt(2));

        // 大小写
        System.out.println("hello".toUpperCase());

        // format：数值型 + 字符型
        System.out.println(String.format("%05.1f 是一个浮点数 \n" +
                                         "%+,3d", 1.23f, -123456));  // % 【标识】 宽度.小数位数 【转换格式】
        System.out.println(String.format("%-5s %-5s", "你好", "hello"));  // % 【标识】 宽度.小数位数 【转换格式】
        System.out.println(String.format("%-5s %-5s", "世界", "world"));  // % 【标识】 宽度.小数位数 【转换格式】

    }
}

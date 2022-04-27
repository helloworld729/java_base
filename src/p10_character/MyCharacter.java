package p10_character;

public class MyCharacter {
    public static void main(String[] args){
        // 初始化
        Character ch = 'a'; // 装箱

        // 转义字符
        System.out.println("转义字符...");
        System.out.println("hello \\ world");

        // 包装类方法
        System.out.println("包装类方法...");
        System.out.println("a是字母：" + Character.isLetter('a'));
        System.out.println("1是数字：" + Character.isDigit('1'));

        System.out.println("U是大写：" + Character.isUpperCase('U'));
        System.out.println("u是小写：" + Character.isLowerCase('u'));
        System.out.println("k转化为大写：" + Character.toUpperCase('k'));
        System.out.println("K转化为小写：" + Character.toLowerCase('K'));

    }
}

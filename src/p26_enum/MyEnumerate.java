package p26_enum;


enum Color {
    RED, GREEN, BLUE;
}


public class MyEnumerate {
    public static void main(String[] args){

        // 直接输出枚举常量
//        System.out.println(Color.RED);

        // 结合values方法，遍历输出
        for (Color c: Color.values()){
            System.out.println(c);
        }

        // 基于switch-case，输出
        Color myColor = Color.BLUE;
        switch(myColor){
            case RED:
                System.out.println("red");
                break;
            case BLUE:
                System.out.println("blue");
                break;
            case GREEN:
                System.out.println("green");
                break;
        }

        System.out.println(Color.GREEN.ordinal());  // 索引
        System.out.println(Color.valueOf("RED"));   // 返回枚举常量
        System.out.println(Color.valueOf("RED").ordinal()); // 枚举常量使用方法

    }
}

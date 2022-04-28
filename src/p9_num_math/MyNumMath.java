package p9_num_math;

public class MyNumMath {
    public static void main(String[] args){
        // 基本数据类型初始化
        int a = 200;
        float b = 1.2f;  // should append f
        double c = 1.3;
        int k = 200;
        System.out.println(a == k);  // true,值和地址相同


        // 包装类初始化
        Integer d = new Integer(2);  // 堆初始化
        Integer e = new Integer(2);  // 堆初始化
        Integer f = 200;  // 常量池初始化
        Integer g = 200;  // 常量池初始化

        System.out.println(d == e);       // false，比较值和地址
        System.out.println(d.equals(e));  // true,只比较值
        System.out.println(f == g);       // false,对于两个公共初始化的对象 -128-127 的时候返回true，其他返回false
        System.out.println(f.equals(g));  // true

        double[] nums = {1.4, 1.5, 1.9};


        for (double n: nums){
            test(n);
        }

        System.out.println(Math.pow(1.3, 8));

    }

    private static void test(double num){
        System.out.println("Math.round(" + num + ")=" + Math.round(num));
    }
}

package p9_num_math;

public class MyNumMath {
    public static void main(String[] args){
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

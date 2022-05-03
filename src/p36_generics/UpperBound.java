package p36_generics;

public class UpperBound {
    public static <N extends Comparable<N>> N max_num(N x, N y, N z){
        N res = x;
        if (y.compareTo(res) > 0){
            res = y;
        }
        if (z.compareTo(res) > 0){
            res = z;
        }

        return res;
    }

    public static void main(String[] args){

        System.out.println("max nums: " + max_num(1, 2, 3));

        System.out.println(1 > 0.9);

    }
}

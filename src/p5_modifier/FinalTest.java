package p5_modifier;


public class FinalTest {
    // 要想被静态方法main，访问，必须使用static修饰
    private static final int get_round(float x){
        return Math.round(x);
    }

    public static void main(String[] args){
        final float a = 1.2f;
//        a += 2;  // can't assign a value to final variable

        System.out.println(FinalTest.get_round(a));  // 被public修饰的类可以被当前类访问，但是在static语境下不能使用this
    }
}

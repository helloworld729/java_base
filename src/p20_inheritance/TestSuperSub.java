package p20_inheritance;

class SuperClass{
    public int n;
    SuperClass(){
        System.out.println("父类无参构造");
    }

    SuperClass(int n){
        System.out.println("父类有参构造，将父类成员设置为：" + n);
        this.n = n;
    }

    public void introduction(){
        System.out.println("this is Super class");
    }
}


class SubClass extends SuperClass{
    public int m;

    SubClass(){
        System.out.println("子类无参构造" + "\n");
    }

    SubClass(int n){
        super(n);  // 调用构造方法
        System.out.println("子类有参构造，成员n被设置为："+n + "\n");
    }

    // 如果父类没有对应的构造函数[这里是说父类没有这种有两个形参的构造函数]，会默认调用无参构造函数
    SubClass(int m, int n){
        System.out.println("子类有参构造，成员n被设置为："+n + "  成员m被设置为: "+m + "\n");
        this.n = n;
        this.m = m;
    }

    public void introduction(){
        System.out.println("this is Sub class");
    }

    public void intro_test(){
        // 访问父类
        super.introduction();
        // 访问子类,在非静态方法中，可以用this代表本类
        this.introduction();
    }

}


public class TestSuperSub {
    public static void main(String[] args){
        SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass(100);
        SubClass sc3 = new SubClass(100, 200);

        sc3.intro_test();
    }
}

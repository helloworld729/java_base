import java.util.Scanner;

public class mytest {
    int num1, num2;

    void setnum(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
    }

    public int add(){
        return num1 + num2;
    }

    // 必须加访问修饰符 public 否则程序找不到入口
    // 必须 设置为 静态方法：只能直接访问静态变量，成员变量需要借助func
    public static void main(String[] argv){
        mytest test = new mytest();
        System.out.println("加法计算器");
        System.out.println("enter 2 nums:");
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        test.setnum(s1.nextInt(), s2.nextInt());
        int ans = test.add();

        System.out.println(ans);
    }
}

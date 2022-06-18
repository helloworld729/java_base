package p23_abstractClass;

abstract class  Student{int age;}

class Studenta extends Student{}

public class AbstractDemo2 {
    public static void main(String[] args) {
        int[] a = new int[5];//创建基本类型数组
        Student[] s = new Student[5];//对象类型数
        a[0] = 1;
        s[0] = new Studenta();
        System.out.println(a[0]);
        System.out.println(s[0]);
    }
}

package p23_abstractClass;

/*
* 主要是想实验2点：
* ①：抽象类虽然不能被实例化，但是可以作为数组的元素
* ②：对象数组存储的是对象的地址，一般类型的数组存储的是具体的值
* */


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

package p23_abstractClass;
import p23_abstractClass.MyExtend;

public class AbstractDemo {
    public static void main(String[] args) {
        MyExtend myExtend = new MyExtend("knight", 27, "Peking", 50000);
        System.out.println(myExtend.toString());
    }
}

package p4_variable_type;

public class PartVariable{
    public void pupAge(){
        int age = 0;  // 局部变量
        age = age + 7;
        System.out.println("小狗的年龄是 : " + age);
    }

    public static void main(String[] args){
        PartVariable test = new PartVariable();
        test.pupAge();
    }
}

package p23_abstractClass;
import p23_abstractClass.MyAbstract;
public class MyExtend extends MyAbstract{

    private int salary;

    public MyExtend(String name, int age, String address, int salary) {
        super(name, age, address);
        setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "MyAbstract{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + getAddress() + '\'' +
                ", salary='" + getSalary() + '\'' +
                '}';
    }
}

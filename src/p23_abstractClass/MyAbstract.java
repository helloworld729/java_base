package p23_abstractClass;

public abstract class MyAbstract {
    private String name;
    private int age;
    private String address;

    public MyAbstract(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        // 实际表明这里的toString都是重写后的方法，为什么呢
        System.out.println(1 + this.toString());
        System.out.println(2 + toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MyAbstract{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

package p21_override;

class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}


class Dog extends Animal{
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}


public class TestOverRide {
    public static void main(String[] args){
        Animal a = new Animal();
        Animal b = new Dog(); // 子类可以实例化父类，但是不能调用父类没有的方法
        Dog d = new Dog();

        a.move();
        b.move();
        d.move();

//        b.bark(); // exception
        d.bark();
    }
}


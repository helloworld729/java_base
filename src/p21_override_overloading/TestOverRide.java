package p21_override_overloading;

class Animal{
    public void move(){
        System.out.println("动物是人类的朋友！");
    }
}


class Dog extends Animal{
    public void move(){
        System.out.println("狗需要遛。。。");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }

    // 函数重载，重载的关键标注是 函数名相同，单数单数类型一定不能相同
    public void bark(int a){
        System.out.println("pretend to write a overloading");
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
        d.bark(1);
    }
}


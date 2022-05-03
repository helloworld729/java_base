package p36_generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    // 通配泛型不用 前置 类型？
    public static  void getElement(List<?> inputs){  // List/ Arraylist all ok
        System.out.println(inputs);
    }

    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Float> nums = new ArrayList<>();
        names.add("Knihgt");
        nums.add(27F);

        getElement(names);
        getElement(nums);

    }
}

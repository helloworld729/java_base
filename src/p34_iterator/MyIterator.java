package p34_iterator;
import java.util.Iterator;
import java.util.ArrayList;

public class MyIterator {
    public static void main(String[] args){

        // 创建集合
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        // next method
        Iterator<String> it = sites.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // hasnext / remove method
        Iterator<String> it2 = sites.iterator();
        while(it2.hasNext()){
            if(it2.next().charAt(0) == 'R'){  // next method will update iterator state
                it2.remove();  // delete the element been pointed
            }
        }
        System.out.println(sites);





    }
}

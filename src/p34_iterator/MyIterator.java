package p34_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {
    public static void main(String[] args){
        ArrayList<String> sites = new ArrayList<> ();

        sites.add("baidu");
        sites.add("meituan");
        sites.add("souhu");

        Iterator<String> it = sites.iterator();

        for(int i=0; i<sites.size(); i++){
            System.out.println(it.next());
        }
    }
}


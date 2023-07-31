package javacollapnacollege;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

    public static void main(String[] args) {
    //creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);   // aa add nahi thay
                        // duplicate element add na thay.


        System.out.println("size of set is :" + set.size());

            //print all element
        System.out.println(set);


        //Iterator
        Iterator it = set.iterator();

        //hashNext fuction and next function aa 2 function hoy. iterator ma

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        //Search - contains
        if (set.contains(1)) {
            System.out.println("set contain 1");
        }
        if (!set.contains(6)) {
            System.out.println("does not contain");
        }

        //delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("does not contain");
        }


    }
}

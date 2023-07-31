package javacollapnacollege;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
       // ArrayList<String> list2 = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        System.out.println(list.get(1));

        //add element in between
        list.add(1,5);
        System.out.println(list);

        list.set(1,7);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //loops
        for (int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}

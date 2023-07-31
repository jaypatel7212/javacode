package Javacollectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {

       // ArrayList<String> fruits = new ArrayList();
        List<String> fruits = new LinkedList<>();
        List<String> vegetables = new ArrayList<>();

        fruits.add("Apple");
        //fruits.add(23);
        fruits.add("Banana");
        fruits.add("hi");

        fruits.set(1,"orange");
      //  fruits.remove(2);
        System.out.println(fruits.size());

        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Apple"));

        String temp[] = new String[fruits.size()];
          fruits.toArray(temp);

          for (String e:temp) {
              System.out.println(e);
          }

       /* List<String> toRemove = new ArrayList<>();
        toRemove.add("Apple");
        toRemove.add("hi");


        */
      //  fruits.removeAll(toRemove);
      //  fruits.clear();

      /*  vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("carrot");


       */
        fruits.addAll(vegetables);
        System.out.println(fruits);

      //  System.out.println(fruits.get(2));

    }
}

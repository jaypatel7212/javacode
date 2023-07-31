package Javacollectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class set1 {
    public static void main(String[] args) {

        //Set<String> fruits = new HashSet<>();   // randomly element show kare

        Set<String> fruits = new LinkedHashSet<>(); // jem elements nakhya hoy em show kare.

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");

        fruits.add("Banana"); // aa add nahi thay dublicate value 6
        System.out.println(fruits.add("Banana"));
        System.out.println(fruits.add("Orange"));

        System.out.println(fruits);
    }
}

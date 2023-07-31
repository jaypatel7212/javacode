package Javacollectionframework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        Set<String> fruits = new TreeSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");           //sorted form ma aave element
        fruits.add("Kiwi");
        System.out.println(fruits);
    }
}

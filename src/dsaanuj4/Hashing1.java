package dsaanuj4;

import java.util.HashSet;

public class Hashing1 {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();

        s.add(5);
        s.add(10);
        s.add(15);
        System.out.println(s);

        if (s.contains(10))
            System.out.println("present");
        else
            System.out.println("not present");

        s.remove(10);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
        System.out.println(s);
    }
}

package Javacollectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map1 {
    public static void main(String[] args) {

        Map<String,Integer> numbers = new HashMap<>();

        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("five",5);

        numbers.put("one",10);

        numbers.putIfAbsent("two",4);

        System.out.println(numbers.get("five"));

        System.out.println(numbers.containsKey("four"));

        System.out.println(numbers.keySet());

        System.out.println(numbers.values());

        System.out.println(numbers);

        System.out.println(numbers.entrySet());

        Set<Entry<String , Integer>> entries = numbers.entrySet();


        for (Entry<String,Integer> entry: entries) {

            entry.setValue(entry.getValue()*100);


        }
        System.out.println(numbers);
    }
}

package Javacollectionframework;

import java.util.PriorityQueue;

public class priorityqueue1 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Kiwi");
        pq.add("Apple");
        pq.add("Banana");
        pq.add("Mango");

        System.out.println(pq);

        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
    }
}

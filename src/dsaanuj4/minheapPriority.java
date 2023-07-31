package dsaanuj4;

import java.util.Collections;
import java.util.PriorityQueue;

public class minheapPriority {
    // min heap using priority queue
    public static void main(String[] args) {

       PriorityQueue<Integer> pq = new PriorityQueue<>();  //min heap mate

     //   PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());     ///max heap mate

        pq.add(5);
        pq.add(15);
        pq.add(10);

        System.out.println(pq.size());

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());

            pq.poll();
        }
    }
}

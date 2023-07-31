package dsaanuj4;

import java.util.Collections;
import java.util.PriorityQueue;

public class findmedian {

    // find median of running stream of integers
    // using priority queue.

    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public void insertNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek()>=num)
            maxHeap.add(num);
        else
            minHeap.add(num);

        if (maxHeap.size()>minHeap.size()+1)
            minHeap.add(maxHeap.poll());
        else if (maxHeap.size()<minHeap.size())
            maxHeap.add(minHeap.poll());
    }
    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return maxHeap.peek()/2.0 + minHeap.peek()/2.0;
        }

        return maxHeap.peek();
    }


}

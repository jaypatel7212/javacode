package dsaanuj4;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthminimumelement {

    //kth minimum element mat
    public static int kthminimum(int a[],int k)
    {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i=0;i<k;i++) {
            pq.add(a[i]);
        }

        for (int i=k;i<a.length;i++){
            if (pq.peek()>a[i])
            {
                pq.poll();
                pq.add(a[i]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int a[] = {20,10,60,30,50,40};
        int k=3;
        System.out.println("kth largest element : "+kthminimum(a,k));
    }
}

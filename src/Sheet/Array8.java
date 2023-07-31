package Sheet;

import java.util.stream.IntStream;

public class Array8 {
    public static void main(String[] args) {            //calculate sum of the element

        int a[] = {1,2,3,4,5};
        int n= a.length;
  //      int sum=0;
//        for (int i=0;i<n;i++)
//        {
//            sum += a[i];                    //using for loops
//                                                    //time co:O(n)
//        }                                               //space co:O(1)
//        System.out.println("sum is "+sum);


        int sum= IntStream.of(a).sum();
        System.out.println("sum is:"+sum);              //usimg collection framework
    }
}

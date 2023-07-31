package dsaanuj;

import java.util.Scanner;

public class clear_ithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");        // clear ith bit using bitmasking.
        int num = sc.nextInt();

        System.out.println("clear ith bit enter this bit position");
        int i = sc.nextInt();
        int mask=~(1<<i);            //left shift ith time
        //  System.out.println(mask);

        System.out.println( "ith bit set number="+(num & mask));  //after clear ith bit number is output.

    }
}

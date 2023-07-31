package dsaanuj;

import java.util.Scanner;

public class set_ithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");        // set ith bit using bitmasking.
        int num = sc.nextInt();

        System.out.println("set ith bit enter this bit position");
        int i = sc.nextInt();
        int mask=(1<<i);            //left shift ith time
        //  System.out.println(mask);

        System.out.println( "ith bit set number="+(num | mask));  //after set ith bit number is output.

    }
}

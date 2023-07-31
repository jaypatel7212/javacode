package sheetNumproblems;

import java.util.Scanner;

public class Num3 {

    public static boolean isPrime(int N) {
        for (int i=2;i<N;i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;        //time co:O(n)
                                //space co:O(1)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        boolean ans=(isPrime(n));
        if (n!=1 && ans==true) {
            System.out.println("prime number");
        }
        else {
            System.out.println("non-prime number");
        }
    }

}

package dsaanuj;

import java.util.Scanner;

public class evenfindwithbitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a nubmer:");
        int num = sc.nextInt();
      /*
        if (num%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
       */
        if ((num&1)==0)         //without using arithmetic operator fine even and odd.
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
}

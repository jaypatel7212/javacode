package dsaanuj;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        int temp=num;
        int sum =0;
        for ( ;num>0 ; )
        {

            int res = num%10;
             sum = (sum*10)+res;
             num=num/10;
        }
        if (temp==sum) {
            System.out.println("number is a palindrome number ");
        }
        else {
            System.out.println(" number is not a palindrome number");
        }
    }

}

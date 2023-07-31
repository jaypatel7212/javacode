package javagtu;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of"+num+ "is:"+fact);
    }
}

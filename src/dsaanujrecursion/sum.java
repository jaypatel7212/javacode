package dsaanujrecursion;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println("sum is :" +sum1(n));

    }
       public static int sum1(int n){
        if (n==1)
            return 1;
        return n + sum1(n-1);
    }
}

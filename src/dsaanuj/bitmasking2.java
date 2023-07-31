package dsaanuj;

import java.util.Scanner;

public class bitmasking2 {
    public static int countSetBits(int n)
    {
        int count =0;
        while (n!=0)
        {       //find number of bits to change to convert a to b:
            count++;
            n = n &(n-1);
        }
        return count;
    }

    public  static int FlippedCount(int a, int b)
    {
        return countSetBits(a ^ b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(FlippedCount(a,b));

    }
}

package dsaanuj;

import java.util.Scanner;

public class Trailingzeros {

     static int findTrailingZeros(int n){
        if(n<0)
        { return -1; }
        else {

            int res = 0;

            for (int i = 5; i <= n;i=i*5) {
                res = res + n / i;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n =sc.nextInt();
        System.out.println("count of trailingzeros in "+ n + " ! is :" + findTrailingZeros(n));
    }
}

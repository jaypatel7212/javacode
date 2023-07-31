package sheetNumproblems;

import java.util.Scanner;

public class Num7 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        check(n);
    }

    public static void check(int n){
        if (n >> 31==0) {
            System.out.println(n +" is positive");
        }
        else if (n >>  31== -1) {
            System.out.println(n+" is negative");
        }
    }

}

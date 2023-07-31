package array;

import java.util.Scanner;

public class arraydemo2 {
    public static void main(String[] args) {
        int [] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("\t passing an array to method");
        System.out.println("how many elements you want:");
        int n = sc.nextInt();
        get_data(a,n);
        put_data(a,n);
    }
    public static void get_data(int [] a,int n){
        int count =0;
        for (int i=0;i<n;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the elements:");
            a[i] = sc.nextInt();
        }
    }
    public static void put_data(int [] a,int n){
        System.out.println("elements :");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}

package Exam;

import java.util.Scanner;

public class FindSingle {

    public static int SingleInteger(int ar[], int ar_size)
    {

        int res = ar[0];
        for (int i = 1; i < ar_size; i++)
            res = res ^ ar[i];    //xor use for all element

        return res;         //return element
    }


    public static void main (String[] args)
    {

        int ar[]={2,2,1,3,3};
        int ar_size=ar.length;


        System.out.println("Element is " + SingleInteger(ar, ar_size) + " ");
    }
}

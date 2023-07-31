package Sheet;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

public class Array3 {
    //reverse array
//    static void reverse(int arr[])
//    {
//        Collections.reverse(Arrays.asList(a));            //timme co:O(n)
//        System.out.println(Arrays.asList(a));             // space com:O(1)
//
//    }

    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int n= arr.length;
//        reverse(arr);
        reverse(arr,n);
    }


    static void reverse(int arr[],int n) {                              //time :O(n)
        int p1 = 0, p2 = n - 1;                                     //space :O(1)
        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }

        printarr(arr, n);
    }

    static void printarr(int arr[],int n)
    {
        System.out.println("reversed arrray is:");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


}






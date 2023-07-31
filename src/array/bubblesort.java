package array;

import java.util.Arrays;

public class bubblesort {
    static int[] a = {30,10,50,40,20,60};
    public static void main(String[] args) {
        System.out.println("before sorting:");
        display();
        //bubble();
        Arrays.sort(a);
        System.out.println("after sorting:");
        display();
    }
    /* public static void bubble(){
        int temp;
        for (int i=0;i<a.length-2;i++)
        {
            for (int j=0;j<a.length-2-i;j++)
            {
                if (a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }*/
    public static void display()
    {
        for (int i=0;i<a.length;i++)
        {
            System.out.println(" "+a[i]);
        }
    }
}

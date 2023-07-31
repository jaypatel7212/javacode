package dsaanuj3;

import static dsaanuj3.Quicksort.quicksort;

public class Quicksort {
    static void display(int[] a){
        int n= a.length;
        for (int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a ={8,4,1,5,9,2};
        int n=a.length;
        System.out.println("before sorting:");
        display(a);
        quicksort(a,0,n-1);
        //    Arrays.sort(a);
        System.out.println("after sorting:");
        display(a);
    }



    public static int partition(int[] a,int l,int h)
    {
        int pivot=a[l];
        int i=l;
        int j=h;

        while (i<j){
            while (a[i]<=pivot)
                i++;

            while (a[j]>pivot)
                j--;


            if (i<j)
                swap(a,i,j);

        }
        swap(a,j,l);
        return j;
    }

    public static void quicksort(int[] a,int l,int h){
        if(l<h)
        {
            int pi=partition(a,l,h);
            quicksort(a,l,pi-1);
            quicksort(a,pi+1,h);
        }
    }
    public static void swap(int[] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}

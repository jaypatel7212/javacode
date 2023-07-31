package dsaanuj3;

public class Insertionsort {

    static void sort(int[] a){
        int n= a.length;
        for (int i=1;i<n;i++)
        {
            int temp = a[i];
            int j=i-1;

            while (j>=0 && a[j]>temp){
                a[j+1] =a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }
    static void display(int[] a){
        int n= a.length;
        for (int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a ={8,4,1,5,9,2};
        System.out.println("before sorting:");
        display(a);
        sort(a);
        //    Arrays.sort(a);
        System.out.println("after sorting:");
        display(a);
    }

    }



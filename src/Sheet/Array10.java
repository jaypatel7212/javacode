package Sheet;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int a[]={2,5,1,7};
        int n= a.length;
        System.out.println("median is:");
        Median(a,n);

    }
    public static void Median(int a[],int n)            //time Co:O(n*logn) sort karyo eni
    {                                                       //space:O(1)
        Arrays.sort(a);

        if (n%2==0)
        {
            int m1=(n/2)-1;
            int m2=(n/2);
            System.out.println((double) (a[m1]+a[m2])/2);
        }
        else
        {
            System.out.println(a[(n/2)]);
        }

    }
}

package Sheet;

import java.util.Arrays;

public class Array5 {
    //find mean and median

    public static void main(String[] args) {
        int a[] = {1,4,2,5,7,8,9,11};
        int n= a.length;

        System.out.println("mean is :"+findmean(a,n));

        System.out.println("median is :"+findmedian(a,n));
    }

    public static double findmean(int a[],int n) {

        int sum=0;
        for (int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        return (double) sum/(double)n;

    }

   public static double findmedian(int a[],int n) {

        Arrays.sort(a);

        if (n%2!=0)
            return (double) a[n/2];
        else
            return (double) (a[(n-1)/2]+a[n/2])/2.0;


    }
}

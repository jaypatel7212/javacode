package Sheet;

public class Array17 {
    public static void main(String[] args) {
        int a[]={1,2,-3,0,-4,-5};
        int ans=maxProductSubArray(a);
        System.out.println("maximum product of sub array is:"+ans);

    }

    public static int maxProductSubArray(int a[])
    {                                                               //time:O(N)
        int prod1=a[0],prod2=a[0],result=a[0];                      //space:O(1)

        for (int i=1;i<a.length;i++)
        {
            int temp=Math.max(a[i],Math.max(prod1*a[i],prod2*a[i]));

            prod2=Math.min(a[i],Math.min(prod1*a[i],prod2*a[i]));

            prod1=temp;
            result =Math.max(result,prod1);
        }
        return result;
    }
}

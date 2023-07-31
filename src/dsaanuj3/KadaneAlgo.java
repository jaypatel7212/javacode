package dsaanuj3;

public class KadaneAlgo {
    public static void main(String[] args) {
      // int a[] ={-2,-3,-1,-7};
         int a[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("maximum sum subarray is:" +maxSubArraySum(a));
    }

    public static int maxSubArraySum(int a[])
    {
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;

        for (int i=0;i<a.length;i++)
        {
            cursum = cursum + a[i];

            if (cursum>maxsum)
            {
                maxsum = cursum;
            }
            if (cursum<0)
            {
                cursum=0;
            }
        }
        return maxsum;
    }
}

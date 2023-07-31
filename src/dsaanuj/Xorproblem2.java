package dsaanuj;

public class Xorproblem2 {


    public static void UniqueNUmbers2(int[]arr, int n)
    {
        int sum = 0;
        for (int i = 0; i<n;i++){

            sum = sum ^ arr[i];
        }

        sum = (sum & -sum);


        int sum1=0;
        int sum2=0;

        for (int i=0; i< arr.length;i++)
        {
            if ((arr[i] & sum)>0)
            {
                sum1 = (sum1^arr[i]);
            }
            else
            {
                sum2 = (sum2^arr[i]);
            }
        }

        System.out.println("the non-repeating elements are  "+ sum1 +" and "+sum2);
    }

    public static void main(String[] args) {
        int []arr = new int[] {5,4,1,4,3,5,1,2};
        int n = arr.length;
        UniqueNUmbers2(arr,n);
    }
}

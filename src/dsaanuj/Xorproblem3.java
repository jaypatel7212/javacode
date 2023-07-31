package dsaanuj;

public class Xorproblem3 {

    static int findUniue(int a[],int n, int k)
    {
        byte sixeof_int=4;
        int INT_SIZE = 8 * sixeof_int;
        int count[]= new int[INT_SIZE];

        for (int i=0;i<INT_SIZE;i++)
        {
            for (int j=0;j<n;j++)
            {
                if((a[j] & (1<<i)) !=0)
                    count[i] +=1;
            }
        }

        int res=0;
        for (int i =0 ;i<INT_SIZE;i++)
        {
            res += (count[i] % k) * (1<<i);
            res = res/ (n % k);
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = {2,2,1,5,1,1,2};
        int n=a.length;
        int k=3;
        System.out.println(findUniue(a,n,k));
    }
}

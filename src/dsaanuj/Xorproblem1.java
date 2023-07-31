package dsaanuj;

public class Xorproblem1 {

    static int findsingle(int ar[],int ar_size)
    {
        int res = ar[0];
        for (int i=1;i<ar_size;i++)
        {
            res = res ^ ar[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int ar[] = {5,4,1,4,3,5,1};
        int n = ar.length;
        System.out.println("Element occuring once is " +findsingle(ar,n));
    }
}

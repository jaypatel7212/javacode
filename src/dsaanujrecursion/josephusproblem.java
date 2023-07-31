package dsaanujrecursion;

public class josephusproblem {
    public static void main(String[] args) {
        System.out.println("josephus problem and answer is :" +jos(5,3));

    }
    public static int jos(int n,int k)
    {
        if (n==1)
            return 0;
        return (jos(n-1,k)+k)%n;
    }
}

package dsaanujrecursion;

public class findnwaynmmatrix {
    public static void main(String[] args) {
        System.out.println("number of ways in matrix is:" +count(3,3));

    }
    public static int count(int n,int m)
    {
        if (n==1||m==1)
            return 1;
        return count(n-1,m)+count(n,m-1);
    }
}

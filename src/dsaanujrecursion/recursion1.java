package dsaanujrecursion;

public class recursion1 {
    public static void main(String[] args) {
        System.out.println("answer is "+ans(3,4));

    }
    public static int ans(int a, int b)
    {
        if(b==0)
            return 1;
        return ans(a,b-1)*a;
    }
}

package dsaanuj;

public class gcd {
    public static void main(String[] args) {
        System.out.println(gcdfun(24,60));

    }
    static int gcdfun(int a, int b) {

        if( b == 0)
            return a;
        else
            return gcdfun(b,a%b);

    }
}

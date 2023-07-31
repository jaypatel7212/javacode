package sheetNumproblems;

public class Num9 {
    static double sumofAp(double a, double d, int n)
    {
        double sum = (n / 2.0) * (2.0 * a + (n - 1) * d);
        return sum;                                         //time co:O(1)
    }                                                       //space co:O(1)
    public static void main(String args[])
    {
        double a = 1.5, d = 3;
        int n = 5;
        System.out.println("Sum of Given Ap Series: "+sumofAp(a, d, n));
    }
}

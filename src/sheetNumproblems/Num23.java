package sheetNumproblems;

public class Num23 {
    public static boolean isAutomorphic(int N) {
        int sq=N*N;

        while (N>0) {

            if (N%10!=sq%10)                            //time co:(N)
                return false;                           //space co:O(1)

            N=N/10;
            sq=sq/10;
        }
        return true;
    }

    public static void main(String[] args) {
        int n=25;
        if (isAutomorphic(n)==true)
            System.out.println("Automorphic number");
        else
            System.out.println("not Automorphic number");
    }
}

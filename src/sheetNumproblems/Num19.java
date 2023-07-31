package sheetNumproblems;

public class Num19 {
    public static void main(String args[]) {
        int n = 5, k = 3;
        int ans = 1;
        for (int i = 0; i < k; i++) {                               //time co:o(k)
            ans = ans * n;                                          //space co:O(1)
        }
        System.out.print(n+" raised to the power "+k+" is "+ans);
    }

/*
    public static void main(String args[]) {
        double n = 2, k = 3;                                    //time co:O(log n)
        double ans=Math.pow(n,k);                               //space:O(1)

        System.out.print(n+" raised to the power "+k+" is "+ans);
    }

*/
}

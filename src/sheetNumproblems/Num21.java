package sheetNumproblems;

public class Num21 {
    public static void main(String[] args) {
        int n=60;
        printFactor(n);

    }

    public static void printFactor(int n) {
        System.out.println("prime factor :");                               //time co:O(N)
        for (int i=2;n>1;i++) {                                             //space co:O(1)
            if (n%i==0) {
                while(n%i==0) {
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
        }

    }
}

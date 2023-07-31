package sheetNumproblems;

public class Num17 {
//    public static void main(String args[]) {
//        int n = 5;
//        if (n == 0) {
//            System.out.println(0);                                //time co:O(n)+O(n)
//        } else {                                                   //space co:O(n)
//            int fib[] = new int[n + 1];
//            fib[0] = 0;
//            fib[1] = 1;
//            for (int i = 2; i <= n; i++) {
//                fib[i] = fib[i - 1] + fib[i - 2];
//            }
//            System.out.println("The Fibonacci Series up to "+n+"th term:");
//            for (int i = 0; i <= n; i++) {
//                System.out.print(fib[i] + " ");
//            }
//        }
//    }


    public static void main(String args[]) {
        int n = 5;
        if (n == 0) {
            System.out.println("The Fibonacci Series up to "+n+"th term:");
            System.out.print(0);
        } else {
            int secondLast = 0;
            int last = 1;                                                           //time co:O(n)
            System.out.println("The Fibonacci Series up to "+n+"th term:");             //space co:O(1)
            System.out.print(secondLast + " " + last + " ");
            int cur;
            for (int i = 2; i <= n; i++) {
                cur = last + secondLast;
                secondLast = last;
                last = cur;
                System.out.print(cur + " ");
            }
        }
    }
}

package sheetNumproblems;

public class Num8 {
//    public static void main(String[] args) {
//
//        solve(5);
//        solve(6);                                                         //time co:O(N)
//    }
//    public static void solve(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println("The sum of the first " + n + " numbers is: " + sum);
//    }
//

    public static void main(String[] args) {

        solve(5);
        solve(6);                                                   //time co:O(1)
    }
    public static void solve(int N) {
        int sum = N * (N + 1) / 2;
        System.out.println("The sum of the first " + N + " numbers is: " + sum);
    }
}

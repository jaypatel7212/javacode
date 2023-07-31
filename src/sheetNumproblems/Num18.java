package sheetNumproblems;

public class Num18 {
    static int factorial(int X) {
        int ans = 1;
        for (int i = 1; i <= X; i++) {                                  //time co:O(n)
            ans = ans * i;                                              //space co:O(1)
        }
        return ans;
    }
    public static void main(String[] args) {

        int X = 5;
        int result = factorial(X);
        System.out.println("The factorial of " + X + " is " + result);
    }


/*
    static int factorial(int X) {
        if (X == 0) {
            return 1;
        }
        return X * factorial(X - 1);
    }
    public static void main(String[] args) {

        int X = 5;
        int result = factorial(X);
        System.out.println("The factorial of " + X + " is " + result);
    }   */
}

package sheetNumproblems;

public class Num22 {
    static int Factorial(int n) {
        int fact=1;
        for (int i=1;i<=n;i++) {                            //time co:O(N*M)   where n is the number of digits and M is the time taken to compute
            fact=fact*i;                                    // the factorial of the digit
        }
        return fact;                                          //space co:O(1)
    }

    static int Strong_No(int num) {
        int sum=0;
        while (num>0) {
            int digit=num%10;
            sum = sum+Factorial(digit);
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number=145;
        int answer = Strong_No(number);

        if (answer==number && number!=0) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}

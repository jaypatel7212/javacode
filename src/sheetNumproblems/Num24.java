package sheetNumproblems;

public class Num24 {
//    public static void main(String[] args) {
//        int num1=30;
//        int num2=60;
//        int ans=1;                                          //time co:O(N)
//        for (int i=1;i<=Math.min(num1,num2);i++) {          //spaace co:O(1)
//            if (num1%i==0 && num2%i==0)
//            ans = i;
//        }
//        System.out.println("gcd is:"+ans);
//    }



    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String args[]) {                        //time co:O(log min(a,b))
        int a = 4, b = 8;                                           //space :O(1)
        int ans = gcd(a, b);
        System.out.print("The GCD of the two numbers is "+ans);
    }

}

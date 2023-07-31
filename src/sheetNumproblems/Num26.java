package sheetNumproblems;

public class Num26 {
    public static void main(String[] args) {
        int n=378;
        int sum=0;
        int temp=n;
        while (temp!=0) {
            sum=sum+temp%10;                                //time co:O(N)
            temp=temp/10;
        }
        if (n%sum==0) {
            System.out.println("yes number is harshad number");
        }
        else {
            System.out.println("no number is not harshad number");
        }
    }
}

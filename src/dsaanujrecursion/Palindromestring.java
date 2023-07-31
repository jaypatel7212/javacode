package dsaanujrecursion;

import java.util.Scanner;

public class Palindromestring {

    static boolean isPalindrome(String s)
    {
        int n = s.length();
        if(n==0)
            return true;
        return isPalin(s,0,n-1);
    }
    static boolean isPalin(String s,int l ,int r)
    {
        if(l>=r)
            return true;
        if ((s.charAt(l)) != (s.charAt(r)))
            return false;
        return isPalin(s,l+1,r-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  the string:");
        String s = sc.nextLine();

        if (isPalindrome(s))
            System.out.println(s+" is palindrome");
        else
            System.out.println(s+" is not a palindrome");
    }
}

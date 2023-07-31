package dsaanujrecursion;

import java.util.Scanner;

public class PowersetString {

        public static void powerset(String s,int i,String cur)
        {
            if (i==s.length())
            {
                System.out.print("  "+cur);
                return;
            }
            powerset(s,i+1,cur+s.charAt(i));
            powerset(s,i+1,cur);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter string:");
            String s = sc.nextLine();
            int i = 0;
            String cur =" ";
            powerset(s,i,cur);

        }


}


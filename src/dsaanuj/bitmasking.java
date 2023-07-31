package dsaanuj;

import java.util.Scanner;

public class bitmasking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");        // find ith bit using bitmasking.
        int num = sc.nextInt();

        System.out.println("find ith bit");
        int i = sc.nextInt();
        int mask=(1<<i);            //left shift ith time
      //  System.out.println(mask);

        if ((num & mask) > 0)
        {
            System.out.println("given position bit is 1.");
        }
        else
        {
            System.out.println("given position bit is 0.");
        }
    }
}

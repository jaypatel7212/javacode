package javagtu;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
       /* System.out.println("enter number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("positive number is:"+num);
        }
        else {
            System.out.println("negative number");
        }*/

      /*  int sum=0,i;
        for(i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println("sum " +sum);

*/
       // Scanner sc = new Scanner(System.in);
        //System.out.println("enter the number:");
        //int num = sc.nextInt();
        //int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = minValue(a,b);
        System.out.println("value:"+c);


    }

    public static int minValue(int x,int y){
        if(x<y){
            return x;
        }
        else {
            return y;
        }
    }

}

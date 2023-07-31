package dsaanuj;

public class Swaptwonumwithxor {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        System.out.println("before  "+a+" "+b);
        int temp = a;
        /*
        a=b;                                //using 3rd variable
        b=temp;
        System.out.println("after  "+a+" "+b);
        */


        a = a^b;
        b = a^b;                        //using xor
        a = a^b;
        System.out.println("after  "+a+" "+b);


    }
}

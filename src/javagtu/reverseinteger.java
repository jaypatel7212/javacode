package javagtu;

public class reverseinteger {

    public static int sumnum() {
        int n=54321;
        int num=n;
        int sum=0;
        while (num>0)
        {
            int temp=num%10;
            sum=sum*10+temp;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=54321;
        System.out.println(sumnum());


    }
}

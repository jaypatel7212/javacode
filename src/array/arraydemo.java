package array;

public class arraydemo {
    public static void main(String[] args) {


        int a[] = {10, 20, 30, 40};
        int sum = 0, i, avg;
        for (i = 0; i < 4; i++) {
            sum = sum + a[i];

        }
        System.out.println("sum is :"+sum);
        avg = sum/4;
        System.out.println("avg:"+avg);

    }
}

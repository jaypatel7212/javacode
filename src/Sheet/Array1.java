package Sheet;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        int arr1[] = {2,6,1,3,0};

        System.out.println("smallest array is:"+ sort(arr1));

    }

    static int sort(int arr[])
    {
        int n = arr.length;
        Arrays.sort(arr);
       // return arr[0];   smallest mate
        return arr[n-1];    // largest mate
    }
}

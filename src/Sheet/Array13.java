package Sheet;

import java.util.Arrays;

public class Array13 {
    public static void main(String[] args) {
        int [] arr={1,1,2,3,4,4,5,2};
        findRepeatingelements(arr);

    }
    public static void findRepeatingelements(int arr[]){
        Arrays.sort(arr);
        System.out.println("array is:");
        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i]==arr[i+1])
                System.out.print(arr[i]+" ");
        }
    }
}

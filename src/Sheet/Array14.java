package Sheet;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int arr[]={1,2,-1,1,3,1};
        System.out.println("Non Repeating number are:");
        findNonRepeating(arr);

    }

    public static void findNonRepeating(int arr[])
    {
        Arrays.sort(arr);
        if (arr[0]!=arr[1])
            System.out.print(arr[0]+" ");

        for (int i=1;i< arr.length-1;i++)
        {
            if (arr[i-1]!=arr[i] && arr[i]!=arr[i+1])
            {
                System.out.print(arr[i]+" ");
            }
        }
        if (arr[arr.length-2]!=arr[arr.length-1])
            System.out.print(arr[arr.length-1]);
    }

}

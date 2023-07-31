package Sheet;

import java.util.HashMap;

public class Array12 {
    public static void main(String[] args) {
        int a[]={2,5,3,2,4,4,6,8,7,8,4,2,5};
        int n=a.length;
        System.out.println("array is:");
        duplicates(a,n);

    }                                               //time co:O(n)
    public static void duplicates(int a[],int n)    //space:O(N)
    {
        HashMap<Integer,Integer> mp =new HashMap<>();
        for (int i=0;i<n;i++)
        {
            if (!mp.containsKey(a[i]))
            {
                System.out.print(a[i]+" ");
                mp.put(a[i],1);
            }
        }
    }
}

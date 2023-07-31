package dsaanuj4;

import java.util.HashMap;
import java.util.HashSet;

public class Hashset5 {
    //find the subarray with the given sum:

    public static void subarraysum(int a[],int n,int sum)
    {
        int  cursum=0;
        int start=0;
        int end=-1;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0;i<n;i++)
        {

            cursum =cursum + a[i];

            if (cursum-sum==0)
            {
                start=0;
                end=i;

                break;
            }
            if (map.containsKey(cursum-sum))
            {
                start=map.get(cursum-sum)+1;
                end=i;
                break;

            }
            map.put(cursum,i);
        }
        if (end==-1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println(start+" to "+end);
        }

    }

    public static void main(String[] args) {
        int a[]={10,15,-5,15,-10,5};
        int sum=5;
        int n=a.length;
       subarraysum(a,n,sum);
    }

}

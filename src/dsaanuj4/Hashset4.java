package dsaanuj4;

import java.util.HashSet;
import java.util.Set;

public class Hashset4 {
    //intersection of two arrays :

    public static int interset(int a[],int b[])
    {
        Set<Integer> set = new HashSet<>();
        int count=0;

        for (int x:a)
        {
            set.add(x);
        }
        for (int x:b)
        {
            if (set.contains(x))
            {
                count++;
                set.remove(x);
            }
        }
      // System.out.println(set);
        return count;
    }

    public static void main(String[] args) {
        int a[]={5,10,15,5,10};
        int b[]={15,5,10,5,4};
        System.out.println("intersection of two array count is :" +interset(a,b));
    }
}

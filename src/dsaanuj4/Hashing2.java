package dsaanuj4;

import java.util.HashSet;
import java.util.Set;

public class Hashing2 {

   public static int countDistinct(int a[])
    {
        Set<Integer> set = new HashSet<>();
        for (int element:a)
        {
            set.add(element);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] a={5,10,15,5,4,5};
        System.out.println("distinct elements:"+countDistinct(a));
    }
}

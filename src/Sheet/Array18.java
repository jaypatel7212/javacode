package Sheet;

import java.util.HashSet;
import java.util.Set;

public class Array18 {
    public static void main(String[] args) {
        int a[]={20,15,26,2,98,6};
        int n=a.length;
        for (int i=0;i<n;i++)
        {
            Set<Integer> s= new HashSet<Integer>();
            for (int j=0;j<n;j++)
            {
                if (a[j]<a[i]) {
                    s.add(a[j]);                                    //time co:O(N*N)
                }                                                    //space co:O(N)
            }
            int rank=s.size()+1;
            System.out.print(rank+" ");

        }
    }
}

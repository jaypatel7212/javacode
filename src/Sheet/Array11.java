package Sheet;

public class Array11 {
    public static void main(String[] args) {
        int a[]={1,2,2,2};
       int k= removeDuplicates(a);
        System.out.println("array is:");
        for (int i=0;i<k;i++)                   //time co;O(n)
        {                                       //space:O(1)
            System.out.print(a[i]+" ");
        }
    }
    public static int removeDuplicates(int a[])
    {
        int i=0;
        for (int j=1;j<a.length;j++)
        {
            if (a[i] != a[j])
            {
                i++;
                a[i]=a[j];
            }
        }
        {                                       //space:O(1)
            System.out.print(a[i]+" ");
        }

        return i+1;
    }
}

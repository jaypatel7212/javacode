package dsaanuj3;

public class selectionsort {

    static void display(int[] a){
        int n= a.length;
        for (int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a ={8,4,1,5,9,2};
        System.out.println("before sorting:");
        display(a);
        selection(a);
        //    Arrays.sort(a);
        System.out.println("after sorting:");
        display(a);
    }

    public static void selection(int[] a)
    {
        int n = a.length;
        for (int i=0;i<n-1;i++)
        {
            int min =i;

            for (int j=i+1;j<n;j++){
                if (a[j]<a[min])
                {
                    min=j;
                }
            }

            if (min!=i)
            {
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
        }
    }
}

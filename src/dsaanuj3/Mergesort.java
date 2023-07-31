package dsaanuj3;

public class Mergesort {

    static void display(int[] a){
        int n= a.length;
        for (int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a ={8,4,1,5,9,2};
        int n=a.length;
        System.out.println("before sorting:");
        display(a);
       Mergesort ob = new Mergesort();
       ob.mergesort(a,0,n-1);
        //    Arrays.sort(a);
        System.out.println("after sorting:");
        display(a);
    }

 public static void mergesort(int[]a,int l,int r)
    {
        if (l<r)
        {
            int m = (l+(r-1))/2;

            mergesort(a,l,m);
            mergesort(a,m+1,r);

            merge(a,l,m,r);
        }

    }

  public static void merge(int []a,int l,int m,int r)
    {
        //find size of two array
        int n1=m-l+1;
        int n2=r-m;

        //create temp array
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i=0;i<n1;i++)
        {
            L[i]=a[l+i];
        }
        for (int j=0;j<n2;j++)
        {
            R[j]=a[m+1+j];
        }

        int i=0,j=0;

        int k=1;

        while (i<n1 && j<n2)
        {
            if (L[i]<=R[j])
            {
                a[k]=L[i];
                i++;
            }
            else
            {
                a[k] = R[i];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j<n2)
        {
            a[k]=R[j];
            j++;
            k++;
        }
    }
}

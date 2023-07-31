package dsaanuj3;

public class SortedandRotatedarray {
    public static void main(String[] args) {
        int []a = {20,30,40,50,60,5,10};
        int key=60;
        System.out.println( "answer is :"+bsearch(a,key));
    }

  public static  int bsearch(int []a,int key)
    {
        int low=0;
        int high=a.length-1;

        while (low<=high)
        {

            int mid= (low+high)/2;

            if (a[mid]==key)
                  return mid;

            if (a[low]<a[mid])
            {
                if (key>=a[low] && key<a[mid])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }

            else
            {
                if (key>a[mid] && key<=high)
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }



        }
        return -1;
    }
}

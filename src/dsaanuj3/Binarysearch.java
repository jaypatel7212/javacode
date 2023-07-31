package dsaanuj3;

public class Binarysearch {


    public static void main(String[] args) {
        int[]a = {10,20,30,40,50,60};
        int key = 40;
        int high = a.length;
        Find(a,0,high,key);
    }
    public static void Find(int[]a,int low,int high,int key)
    {
        int mid;
        if(low>high){
            System.out.println("error");
            return;
        }
        mid=(low+high)/2;
        if (key==a[mid])
            System.out.println("\n the element is present at location "+(mid+1));
        else if (key<a[mid])
            Find(a,low,mid-1,key);
        else if (key>a[mid])
            Find(a,mid+1,high,key);
    }



}



package array;

public class linearsearch {
    public static void main(String[] args) {
        int []a ={1,5,-2,8,7,11,40,32};
        System.out.println("the element is at location "+ Find(a,7));
        System.out.println("the element is at location "+ Find(a,40));
    }
    public static int Find(int[] a,int key)
    {
        int i;
        for (i=0;i<a.length;i++){
            if(a[i]==key){
                return i+1;
            }

        }
        return -1;
    }
}

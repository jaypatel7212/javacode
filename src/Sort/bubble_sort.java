package Sort;

public class bubble_sort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int n= arr.length;
        System.out.println("Before using Bubble sort:");
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("after bubble sort:");
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

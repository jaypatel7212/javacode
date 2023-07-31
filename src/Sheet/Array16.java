package Sheet;

public class Array16 {
    public static void main(String[] args) {
        int arr[][]={{1,2},{2,1},{3,4},{4,5},{5,4}};
        int n= arr.length;

        for (int i=0;i<n;i++)                           //time co:O(n*n)
        {                                               //space O(1)
            for (int j=i+1;j<n;j++)
            {
                if (arr[j][0]==arr[i][1] && arr[j][1]==arr[i][0])
                {
                    System.out.print("("+arr[i][1]+" "+arr[i][0]+")"+" ");
                    break;
                }
            }
        }
    }
}
/*

public static void main(String args[]) {

    int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};

    HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
    System.out.println("The Symmetric Pairs are: ");
    for (int i = 0; i < arr.length; i++) {
      int first = arr[i][0];
      int second = arr[i][1];
      if (mp.get(second) != null && mp.get(second) == first) {
        System.out.print("("+first + " " + second+") ");
      } else {
        mp.put(first, second);
      }
    }

  }



 */
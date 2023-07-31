package sheetNumproblems;

public class Num20 {
    static void Divisor(int n)
    {
        for (int i=1;i<=n;i++)                              //time co:O(N)
            if (n%i==0)                                      //space co:O(1)
                System.out.print(i+" ");
    }
    public static void main(String args[])
    {   int n = 6;
        System.out.print("Factors of " + n + " are: ");
        Divisor(n);
    }


/*



    static void Divisor(int n)
    {
        for (int i=1;i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                    // If divisors are equal, print only one            //time co;O(sqrt(n))
                if (n/i == i)                                           //space co:O(1)
                    System.out.print(" "+ i);

                else // Otherwise print both
                    System.out.print(i+" " + n/i + " " );
            }
        }
    }
    public static void main(String args[])
    {   int n = 14;
        System.out.print("Factors of " + n + " are: ");
        Divisor(n);;
    }


    */


}

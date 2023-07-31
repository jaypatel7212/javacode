package dsaanuj3;

public class StockBuySell2 {
    public static void main(String[] args) {
        int a[] = {5,2,6,1,4,7,3,6};
        System.out.println("max profit is :" +maxprofit(a));
    }
    public static int maxprofit(int a[])
    {
        int profit=0;
        for (int i=1;i<a.length;i++)
        {
            if (a[i]>a[i-1])
            profit = profit + (a[i]-a[i-1]);

        }
        return profit;
    }


}

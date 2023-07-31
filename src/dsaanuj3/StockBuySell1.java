package dsaanuj3;

public class StockBuySell1 {
    public static void main(String[] args) {

        int a[] = {5,2,6,1,4};
        System.out.println("max profit is :" +maxProfit(a));
    }
    public static int maxProfit(int a[])
    {
        int maxprofit =0;
        int  minSofar=a[0];

        for (int  i=0;i<a.length;i++)
        {
            minSofar = Math.min(minSofar,a[i]);

            int Profit = a[i] - minSofar;

            maxprofit = Math.max(Profit,maxprofit);
        }
        return maxprofit;
    }
}

package dsaanuj;

public class FastPower {
    public static void main(String[] args) {
        System.out.println(fastpower(3978432,5,1000000007));

    }

    /*
    static  int fastpower(int a,int b){
        int res =1;
        while ( b > 0 ){
            if ((b&1) != 0) {
                res = res * a;
            }

            a = a * a;
            b = b >>1;    //  b/2 mate b>>1 use karyu .
        }
        return res;

     */

    static  long fastpower(long a,long b,int n){
        long res =1;
                                // mota number mate use thay aa rit
        while ( b > 0 ){

            if ((b&1) != 0) {
                res = (res * a % n) % n;
            }

            a = (a % n * a % n) % n;
            b = b >>1;    //  b/2 mate b>>1 use karyu .
        }
        return res;

    }
}

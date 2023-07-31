package String2;

public class String16 {
    public static void main(String[] args) {
        String str="apple";
        System.out.println("maximum occurring character is:"+maxoccurringChar(str));
    }

    public static char maxoccurringChar(String str) {
        char ans='a';
        int maxfreq=0,n=str.length();
        int count[]=new int[256];
        for (int i=0;i<n;i++) {
            count[str.charAt(i)]++;
            if (count[str.charAt(i)]>maxfreq) {
                maxfreq=count[str.charAt(i)];
                ans=str.charAt(i);
            }
        }
        return ans;
    }
}

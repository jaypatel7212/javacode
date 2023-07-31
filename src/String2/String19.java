package String2;

public class String19 {
    public static void main(String[] args) {
        String str ="abcxyz";
        int n = str.length();
        System.out.println("original string"+str);
        System.out.println("new string:"+solve(str,n));
    }

    public static String solve(String str,int n)
    {
        StringBuffer ans = new StringBuffer();
        for (int i=0;i<n;i++) {
            int ascii=(int) (str.charAt(i));
            if (ascii==90)
                ans.insert(i,(char)(65));
            else if (ascii==122)
                ans.insert(i,(char)(97));

            else if((ascii>=65 && ascii<90)||(ascii>=97 && ascii<122))
                    ans.insert(i,(char)(ascii+1));
        }
        return ans.toString();
    }
}

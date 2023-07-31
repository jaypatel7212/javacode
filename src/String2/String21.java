package String2;

public class String21 {
    public static void main(String[] args) {
        String str = "JaY PatEL";
        int n= str.length();
        System.out.println("before string : "+str);
        System.out.println("after String : "+solve(str,n));
    }

    public static String solve(String str,int n)
    {
        StringBuffer ans= new StringBuffer();
        for(int i=0;i<n;i++) {
            int ascii = (int)str.charAt(i);

            if(ascii>=65 && ascii<=90)
                ans.append((char)(ascii+32));
            else if(ascii>=97 && ascii<=122)
                ans.append((char)(ascii-32));
            else if(str.charAt(i)==' ')
                ans.append(' ');
        }
        return ans.toString();
    }
}

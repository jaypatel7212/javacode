package String2;

public class String17 {
    public static void main(String[] args) {
        String str= "abcbc";
        System.out.println("original string is :"+str);
        System.out.println("string is:"+removeDuplicate(str));
    }
    public static String removeDuplicate(String s)
    {
        String ans="";
        for(int i=0;i< s.length();i++)
        {
            int j=0;
            for(j=0;j<i;j++) {
                if(s.charAt(i)==s.charAt(j))
                {
                    break;
                }
            }
            if(i==j)
            {
                ans+=s.charAt(i);

            }
        }
        return ans;
    }
}

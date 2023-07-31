package String;

public class String6 {
    public static void main(String[] args) {
        String str = "take12% *&#u 7forw@ad";
        int n= str.length();
        System.out.println("Resultant string");
        System.out.println(solve(str,n));
    }
                                                                //time co:O(n)
    public static String solve(String str,int n) {              //space co:O(n)

        StringBuffer ans= new StringBuffer();

        for (int i=0;i<n;i++) {
            int ascii = (int) str.charAt(i);
            if ((ascii>=65 && ascii<=90)||(ascii>=97 && ascii<=122))
                ans.append(str.charAt(i));
        }
        return ans.toString();
    }
}

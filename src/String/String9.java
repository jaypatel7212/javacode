package String;

public class String9 {
    public static void main(String[] args) {

        String str = "take u forward isawesome";
        int size=str.length();

        System.out.println("after capitalize string is:");
        System.out.println(Capitalize(str,size));
    }

    public static String Capitalize(String str,int size) {

        StringBuffer sb = new StringBuffer(str);

        for (int i=0;i<size;i++) {
            if(i==0||i==(size-1))
            {
                sb.setCharAt(i,Character.toUpperCase((char)(int)str.charAt(i)));
            }
            else if (str.charAt(i)==' ')
            {
                sb.setCharAt(i-1,Character.toUpperCase((char)(int)str.charAt(i-1)));

                sb.setCharAt(i+1,Character.toUpperCase((char)(int)str.charAt(i+1)));
            }
        }
        return sb.toString();
    }

}

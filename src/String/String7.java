package String;

public class String7 {
    public static void main(String[] args) {
        String str="jay patel";
        int i=0;
        int j=str.length()-1;

        while (i<j) {
            str=swap(str,i,j);                              //time co:O(N)
            i++;                                            //space co:O(1)
            j--;
        }
        System.out.println("reverse string is:"+str);
    }

    public static String swap(String s,int i,int j) {
        StringBuilder str = new StringBuilder(s);
        str.setCharAt(i,s.charAt(j));
        str.setCharAt(j, s.charAt(i));

        return str.toString();
    }


//    public static void main(String[] args) {
//        String str = "hello";
//        StringBuilder str1= new StringBuilder(str);
//        str1.reverse();
//        str=str1.toString();
//        System.out.println("reverse string:"+str);
//
//    }
}
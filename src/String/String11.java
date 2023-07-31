package String;

public class String11 {

    public static void main(String[] args) {
        String st ="take u forward";
        int n = st.length();
        System.out.println("non repeating string is:");
        printFrequency(st,n);

    }

    public static void printFrequency(String st,int n) {
        int freq[] = new int [200];
        char s[]=st.toCharArray();
        for(int i=0;i<n;i++) {
            if(st.charAt(i)==' ')
                continue;
            else
                freq[(int)st.charAt(i)]++;
        }
        for (int i=0;i<n;i++) {
            if (freq[(int)st.charAt(i)]==1 && s[i]!=' ') {
                System.out.print(s[i]+ " ");
            }
        }
    }

}

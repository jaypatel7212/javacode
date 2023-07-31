package String;

import java.util.Locale;

public class String2 {

    public static void solve(String str,int length) {
        int vowels=0, consonants=0, whitespace=0;
        str=str.toLowerCase();
        for (int i=0;i<length;i++) {
            char ch=str.charAt(i);

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')            //time co:O(N)
                vowels++;                                               //space:O(1)
            else if (ch>='a' && ch<='z')
                consonants++;
            else if (ch==' ')
                whitespace++;
        }
        System.out.println("vowels"+vowels);
        System.out.println("consonants:"+consonants);
        System.out.println("whitespaces:"+whitespace);
    }

    public static void main(String[] args) {
        String str="Jay  pate l";
        int length=str.length();
        solve(str,length);
    }
}

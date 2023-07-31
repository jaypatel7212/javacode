package String2;

public class String22 {
    public static void main(String[] args) {

        String s = " jay kumar mukeshbhai patel";
        char []p=reverseWords(s.toCharArray());
        System.out.println(p);

    }

    public static void reverse(char str[],int start,int end)
    {
        char temp;

        while(start<=end)
        {
            temp=str[start];
            str[start]=str[end];
            str[end]= temp;
            start++;
            end--;
        }
    }
    public static char[] reverseWords(char []s)
    {
        int start=0;
        for(int end=0;end<s.length;end++){

            if(s[end]==' ')
            {
                reverse(s,start,end);
                start=end+1;
            }
        }

        reverse(s,start,s.length-1);

        reverse(s,0,s.length-1);

        return s;
    }
}

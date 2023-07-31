package sheetNumproblems;

public class Num14 {
    public static void main(String args[]) {
        int year = 2020;
        if (((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0)) {               //time;O(1)
            System.out.println("Yes");                                                  //space:O(1)
        } else {
            System.out.println("No");
        }
    }
}

package Exam;

import java.util.Scanner;

public class TheSumOf {

    public static void main(String[] args) {
        int a[] = {2, 7, 11, 15};
        int target = 9;
        int n = a.length - 1;

        for (int i = 0; i < n - 1; i++) {
            if ((a[i] + a[i + 1]) == target) {
                System.out.println(i + " " + (i + 1));
            }
        }

    }

        }


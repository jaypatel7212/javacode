package javagtu;

import java.util.Scanner;

class Student
{
    int rollno;
    String name;
    public void set_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rollno:");
        rollno=sc.nextInt();
        System.out.println("enter name:");
        name=sc.next();

    }
    public void display_data(){
        System.out.println(rollno+"\t"+name);

   }
}
public class StudentInfo {
    public static void main(String[] args) {
        Student [] obj = new Student[10];
        System.out.println("how many record:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            obj[i]=new Student();
            obj[i].set_data();
        }
        System.out.println("the student records are...");
        System.out.println("..........................");
        System.out.println("RollNO\t Name");
        System.out.println("....................................");
        for (int i=0;i<n;i++){
            obj[i].display_data();
        }
    }
}

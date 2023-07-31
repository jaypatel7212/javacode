package javagtu;

import Interface.Student;

public class demo2 {
    String name;
    int rollno;
    public void get_data(int r,String nm)
    {
        rollno=r;
        name=nm;
    }
    public void put_data()
    {
        System.out.println("RollNo:"+rollno);
        System.out.println("Name:"+name);
    }

    public static void main(String[] args) {
        demo2 d1 = new demo2();
        demo2 d2 = new demo2();
        d1.get_data(2,"jay");
        d2.get_data(5,"sakshi");
        d1.put_data();
        d2.put_data();
    }
}

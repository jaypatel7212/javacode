package javagtu;

public class Circle {
    double radius;
    Circle()
    {

    }
    Circle(double r)
    {
        radius=r;
    }
    void area(){
        double area;
        System.out.println("\n radious of circle="+radius);
        area=3.14*radius*radius;
        System.out.println("\n area of circle ="+area);
    }

    public static void main(String[] args) {
        Circle obj = new Circle(10);
        obj.area();
    }
}

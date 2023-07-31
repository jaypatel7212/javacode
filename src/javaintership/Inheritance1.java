package javaintership;

class Single{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog2 extends Single
{
    void bark(){
        System.out.println("barking...");
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.bark();
        d.eat();
    }
}

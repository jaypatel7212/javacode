package javaintership;

class hie{
    void eat(){
        System.out.println("eating....");
    }
}
class Dog3 extends hie{
    void bark(){
        System.out.println("barking...");
    }
}
class Cat5 extends hie{
    void Meow(){
        System.out.println("meowing....");
    }
}
public class Inheritance3 {
    public static void main(String[] args) {
        Cat5 c=new Cat5();
        Dog3 d = new Dog3();
        c.Meow();
        c.eat();
        d.bark();
        d.eat();
    }
}

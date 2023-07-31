package javaintership;

abstract class Bike15{
    Bike15()
    {
        System.out.println("bike is created");
    }
    abstract void run();
    void changeGear()
    {
        System.out.println("gear changed");
    }
}
class Honda2 extends Bike15 {
    void run() {
        System.out.println("running is safely");
    }
}

class Abstraction2 {
    public static void main(String[] args) {
        Bike15 obj = new Honda2();
        obj.run();
        obj.changeGear();
        }

    }


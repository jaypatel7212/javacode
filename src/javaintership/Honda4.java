package javaintership;

abstract class Bik
{
    abstract void run();
}
 class Honda4 extends Bik {
    void run()
    {
        System.out.println("running safely..");
    }

     public static void main(String[] args) {
         Bik obj = new Honda4();
         obj.run();
     }
}

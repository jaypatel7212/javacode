package Interface;

public abstract class Person implements Student,YouTuber {
    public static void main(String[] args) {

        Person obj = new Person() {
            @Override
            public void makevideo() {

            }
        };
        obj.makevideo();
        obj.study();
    }

    public void study()

    {
        System.out.println("person is studying");

    }
    public abstract void makevideo();
    {
        System.out.println("person is making a video");
    }

}

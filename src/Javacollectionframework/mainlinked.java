package Javacollectionframework;

public class mainlinked {

    public static void main(String[] args) {

        MyLinkedList myll = new MyLinkedList();

        //myll.add(12);
        //myll.add(7);

        for (int i=0;i<10;i++)
        {
            myll.add(i);
        }
        myll.print();
    }
}

package Javacollectionframework;

public class MyStack<E> {

    private MyLinkedList<E> ll = new MyLinkedList();

    void push(E e){
        ll.add(e);

    }

    E pop() throws Exception{
        if (ll.isEmpty()){
            throw new Exception("popping from empty stack is not allow");
        }

        return ll.removeLast();
    }

    E peek() throws Exception {
        if (ll.isEmpty()){
            throw new Exception("popping from empty stack is not allow");

        }

        return ll.getLast();

    }
}

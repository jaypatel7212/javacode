package Javacollectionframework;


public class MainClass {

    public static void main(String[] args)throws Exception {

       MyStack<Integer> stack = new MyStack<>();

        stack.push(12);
        stack.push(24);
        stack.push(36);

        int popped = stack.pop();

        System.out.println("pop node:"+popped);
        System.out.println("stack is:"+stack);

        popped = stack.pop();
       // popped = stack.pop();
        System.out.println(popped);
      //  int peeked = stack.peek();
        System.out.println(stack.peek());
          }
}

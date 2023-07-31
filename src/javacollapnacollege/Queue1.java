package javacollapnacollege;

public class Queue1 {           //implementation using array
    static class Queue {
        static int arr[];
        static int size;
        static  int rear =-1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear ==-1;
        }

        //enqqueue
        public static void add(int data) {
            if(rear==size-1) {
                System.out.println("full queue");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        //dequeue
        public static int remove() {
            if (isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front =arr[0];
            for (int i=0; i<rear;i++) {
                arr[i] =arr[i+1];
            }
            rear--;
            return front;
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);


    }
}

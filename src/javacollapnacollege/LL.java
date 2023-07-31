package javacollapnacollege;

public class LL {    //without collectionframework
    Node head;

    class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //add - first , last

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null)
        {
            head =newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null)
        {
            head =newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next!=null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }
    //print
    public void printList() {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while (currNode!=null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NUll");



    }


    //delete first
    public void deleteFirst(){
        if(head==null) {
            System.out.println("The list is empty");
            return;
        }

        head=head.next;
    }

    //delete last
    public void deleteLast(){
        if(head==null) {
            System.out.println("The list is empty");
            return;
        }


        if (head.next==null){
            head=null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next!=null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next=null;

    }


    public void reverseIterate(){
        // reverse a linked list
        if (head==null || head.next==null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode !=null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode =nextNode;
        }
        head.next = null;
        head = prevNode;
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
       // list.printList();
        list.addLast(4);
        list.addLast(5);
        list.printList();

//        list.deleteFirst();
//        list.printList();
//
//        list.deleteLast();
//        list.printList();

        list.reverseIterate();
        list.printList();
    }
}

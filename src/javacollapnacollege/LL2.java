package javacollapnacollege;

import java.util.LinkedList;

public class LL2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("b");
        System.out.println(list);
        list.addLast("jay");
        list.add("kumar");      //add default last ma j add thay
        list.addFirst("patel");
        System.out.println(list);

        System.out.println(list.size());

        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);
//        list.removeLast();
//        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}

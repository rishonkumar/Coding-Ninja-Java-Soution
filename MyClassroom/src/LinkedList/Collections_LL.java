package LinkedList;

import java.util.LinkedList;

public class Collections_LL {
    public static void main(String[] args) {

        LinkedList<Integer>list = new LinkedList<>(); //double linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1,100); // 10-100-20-30
        list.addFirst(80);
        list.set(0,60); // to replace the value
        list.remove(); //default will remove 1st

        System.out.println(list.get(1));
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

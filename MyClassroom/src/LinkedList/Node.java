package LinkedList;
public class Node<T> {
    T data;
    Node<T> next; //coz type of both is node so we create Node next

    Node(T data) {
        this.data = data;
        //next = null; not requried coz default constructor will do it
    }
}

package LinkedList;

public class LinkedListUse {
    public static Node<Integer> createLinkedList() {
        Node<Integer>n1 = new Node<>(10);
        Node<Integer>n2 = new Node<>(20);
        Node<Integer>n3 = new Node<>(30);
        Node<Integer>n4 = new Node<>(40); // 10,20,30,40
        n1.next = n2; //connection between n1 and n2
//		System.out.println("n1" + n1 + " data " + n1.data + " next " + n1.next);
        n2.next = n3;
//		System.out.println("n2" + n2 + " data " + n2.data + " next " + n2.next);
        n3.next = n4;
//		System.out.println("n1" + n3 + " data " + n3.data + " next " + n3.next);
//		System.out.println("n1" + n4 + " data " + n4.data + " next " + n4.next);

        return n1; //return n1 because its the head of the linked list
    }

    //Printing the Linked List
    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp!=null) {
            System.out.print(temp.data + ",");
            temp=temp.next;
        }
    }

    //Increment Every element in the linked list
    public static void increment(Node<Integer> head) {
        Node<Integer>tempNode = head;
        while(tempNode!=null) {
            tempNode.data++;
            tempNode=tempNode.next;
        }
    }

    //To find the length of linked list
    public static int length(Node<Integer>head){
        int length=0;
        Node<Integer> temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    //TO find the i th postion in LinkedList
    public static void printIthNode(Node<Integer>head, int i){
        if(i>length(head))
            return;
        int position = 0;
        Node<Integer>temp = head;
        while(temp!=null && position<i){
            temp=temp.next;
            position++;
        }
        if(temp!=null){
            System.out.println(temp.data);
        }

    }



    public static void main(String[] args) {

        Node<Integer> head = createLinkedList();
        print(head);
        increment(head);
        print(head);
        int length = length(head);
        System.out.println(length);
        printIthNode(head,2);
//		Node<Integer> n1 = new Node<>(10); //new node is created
//		System.out.println(n1); //prints the address of 10
//		System.out.println(n1.data); // to print the data
//		System.out.println(n1.next);
    }

}

package LinkedList;

import java.util.Scanner;

/*
2
3 4 5 2 6 1 9 -1
0 20
10 98 7 66 8 -1
5 99

20 3 4 5 2 6 1 9
10 98 7 66 8 99

1
3 4 5 2 6 1 9 -1
3 100

3 4 5 100 2 6 1 9
 */
public class Insert_Node_LL {
    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
        int currentPosition = 0;
        Node<Integer> newNode = new Node<Integer>(data);

        if (pos == 0) {  // add node in head
            newNode.next = head; //connect new node with previous head
            head = newNode; // then make newnode as head
            return head;
        }
        Node<Integer> temp = head;
        while (temp != null && currentPosition < (pos - 1)) {
            temp = temp.next;
            currentPosition++;
        }
        if (temp == null) return head;

        newNode.next = temp.next; //connecting new node with the next node
        temp.next = newNode;
        return head;
    }

    public static Node<Integer> insertRecursive(Node<Integer> head, int pos, int data) {

        if(head == null && pos>0)
            return head;
        if (pos == 0) {
            Node<Integer> newNode = new Node<Integer>(data);
            newNode.next = head;
            return newNode;
        }
        else{
            Node<Integer> smallerHead = insertRecursive(head.next, pos-1, data);
            head.next = smallerHead; //add head with smallerhead
            return head;
        }
    }

    public static void printRecursive(Node<Integer>head){
        if(head == null){
            return;
        }
        System.out.print(head.data + "->");
        printRecursive(head.next); // it will be head for next node

    }

    public static Node<Integer>takeInput(){
        Scanner scn = new Scanner(System.in);
        int data = scn.nextInt();
        Node<Integer> head = null;
        Node<Integer>tail = null;
        //add elements until u enter -1
        while(data!=-1){
            //you will create node if its not -1
            Node<Integer> currentNode=new Node<Integer>(data);
            if(head==null){
                //make this node as head node
                head = currentNode;
                tail = currentNode;
            }else{
                tail.next=currentNode;
                tail=currentNode; // or tail=tail.next
            }
            data=scn.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = insertRecursive(head , 0, 20);
        printRecursive(head);
    }

}

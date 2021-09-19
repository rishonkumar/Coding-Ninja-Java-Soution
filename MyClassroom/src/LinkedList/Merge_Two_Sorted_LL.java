package LinkedList;

import java.util.Scanner;

public class Merge_Two_Sorted_LL {
    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null) return head2;
        else if (head2 == null) return head1;

        Node<Integer> t1 = head1, t2 = head2;
        Node<Integer> head = null, tail = null;

        //checking the head
        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        // to check others
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        //one list is over
        if (t1 != null) {
            //first list is remaining
            tail.next = t1;
        } else {
            tail.next = t2;
        }
        return head;
    }

    public static Node<Integer> takeInput() {
        Scanner scn = new Scanner(System.in);
        int data = scn.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        //add elements until u enter -1
        while (data != -1) {
            //you will create node if its not -1
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) {
                //make this node as head node
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode; // or tail=tail.next
            }
            data = scn.nextInt();
        }
        return head;
    }

    public static void printRecursive(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + "->");
        printRecursive(head.next); // it will be head for next node

    }

    public static void main(String[] args) {
        Node<Integer> head1 = takeInput();
        Node<Integer> head2 = takeInput();
        Node<Integer> head = mergeTwoSortedLinkedLists(head1, head2);
        printRecursive(head);
    }
}

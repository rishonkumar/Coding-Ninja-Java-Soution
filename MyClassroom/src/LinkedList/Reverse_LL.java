package LinkedList;

import java.util.Scanner;

class DoubleNode{
    Node<Integer> head;
    Node<Integer> tail;
    DoubleNode(){

    }
    DoubleNode(Node<Integer> head, Node<Integer> tail){
        this.head = head;
        this.tail = tail;
    }
}


public class Reverse_LL {


    public static Node<Integer> reverseLinkedList(Node<Integer>head){

        Node<Integer>prev = null;
        Node<Integer>curr = head;

        while(curr!=null){
            Node<Integer> next = curr.next;
            curr.next=prev;
            prev=curr;
            curr = next;

        }
        return prev;
    }

    public static int length(Node<Integer>head){
        int length=0;
        Node<Integer> temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public static Node<Integer> reverseLLRecursive(Node<Integer>head){

        if(head==null || head.next==null)
            return head;

        Node<Integer> smallHead = reverseLLRecursive(head.next);
        Node<Integer> tail = smallHead;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next = head;
        head.next = null;

        return smallHead;
    }

    public static DoubleNode reverseBetter(Node<Integer>head){

        DoubleNode ans;
        if(head == null || head.next==null){
            ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        //This double node will have both head and tail of reversed LL
        DoubleNode smallAns = reverseBetter(head.next);
        smallAns.tail.next = head;
        head.next = null;
        ans = new DoubleNode();
        ans.head = smallAns.head;
        ans.tail = head;
        return ans;
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

    public static void printRecursive(Node<Integer>head){
        if(head == null){
            return;
        }
        System.out.print(head.data + "->");
        printRecursive(head.next); // it will be head for next node

    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        DoubleNode ans= reverseBetter(head);
        printRecursive(ans.head);
    }
}

package Stacks;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

public class StackUse2 {

    //Define the data members
    private Node head;
    private int size;


    public StackUse2() {
        //Implement the Constructor
        this.head = null;
        this.size = 0;
    }
    /*----------------- Public Functions of Stack -----------------*/

    public int getSize() {
        //Implement the getSize() function
        return this.size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return this.size==0;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node newNode = new Node(element);
        if(this.head == null) this.head = newNode;
        else{
            newNode.next = head;
            this.head = newNode;
        }

        this.size++;
    }

    public int pop() {
        //Implement the pop() function
        if(head==null) return -1;

        int ans = this.head.data;
        this.head = this.head.next;
        this.size--;
        return ans;
    }

    public int top() {
        //Implement the top() function
        if(this.head==null) return -1;

        return this.head.data;
    }


}
package LinkedList;

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
    public static Node<Integer>insert(Node<Integer>head, int pos, int data){
        int currentPosition = 0;
        Node<Integer> newNode = new Node<Integer>(data);

        if(pos==0) {  // add node in head
            newNode.next = head; //connect new node with previous head
            head = newNode; // then make newnode as head
            return head;
        }
        Node<Integer> temp = head;
        while(temp!=null && currentPosition < (pos-1)){
            temp=temp.next;
            currentPosition++;
        }
        if(temp==null) return head;

        newNode.next=temp.next; //connecting new node with the next node
        temp.next = newNode;
        return head;
    }

}

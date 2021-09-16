package LinkedList;

public class Delete_Node_In_LL {

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {

        if (head == null) return head;

        if (pos == 0) {
            return head.next;
        }
        int currentPosition = 0;
        Node<Integer> currentHead = head;
        while (currentHead != null && currentPosition < (pos - 1)) {
            currentHead = currentHead.next;
            currentPosition++;
        }
        if (currentHead == null || currentHead.next == null) {
            return head; //if CH is null or CH of next is null
        }
        currentHead.next = currentHead.next.next; // point the element to the deleted next element
        return head;
    }

    public static  Node<Integer> deleteNodeRecurive(Node<Integer>head, int pos){

        if(head == null) return head;

        if(pos==0){
            return head.next;
        }
        Node<Integer> newHead = deleteNodeRecurive(head.next,pos-1);
        head.next=newHead;
        return head;
    }




}

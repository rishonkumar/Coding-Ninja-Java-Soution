package LinkedList;

public class Remove_Duplicate_LL {

    public static Node<Integer>removeDuplicates(Node<Integer>head){

        if(head==null) return head;

        Node<Integer>currHead = head;

        while(currHead.next!=null){
            if(currHead.data.equals(currHead.next.data))
                currHead.next=currHead.next.next;
            else
                currHead=currHead.next;
        }
        return head;
    }
}

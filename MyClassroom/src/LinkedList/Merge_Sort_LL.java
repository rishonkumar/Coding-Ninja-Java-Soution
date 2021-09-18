package LinkedList;

public class Merge_Sort_LL {


    public static Node<Integer> findMid(Node<Integer> head){

        if(head == null || head.next == null) return head;

        Node<Integer> s = head;
        Node<Integer> f = head;

        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }

    public static Node<Integer> mergeSort(Node<Integer> head) {

        if(head == null || head.next==null) return head;

        Node<Integer> mid = findMid(head);

        Node<Integer>half1 = head; //first half1 head is head
        Node<Integer>half2 = mid.next; //second half2 head is mid of next
        mid.next = null; //point it to null

        half1 = mergeSort(half1);
        half2 = mergeSort(half2);
        
        Node<Integer>finalHead = Merge(half1,half2);

        return finalHead;

    }

    public static Node<Integer>Merge(Node<Integer>head1, Node<Integer>head2){
        if (head1 == null) return head2;
        else if (head2 == null) return head1;


        Node<Integer> newhead = null, newtail = null;

        //checking the head
        if (head1.data <= head2.data) {
            newhead = head1;
            newtail = head1;
            head1 = head1.next;
        } else {
            newhead = head2;
            newtail = head2;
            head2 = head2.next;
        }
        // to check others
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                newtail.next = head1;
                newtail = newtail.next;
                head1 = head1.next;
            } else {
                newtail.next = head2;
                newtail = newtail.next;
                head2 = head2.next;
            }
        }
        //one list is over
        if (head1 != null) {
            //first list is remaining
            newtail.next = head1;
        } else {
            newtail.next = head2;
        }
        return newhead;
    }
}

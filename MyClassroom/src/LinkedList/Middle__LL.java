package LinkedList;

public class Middle__LL {


    public static Node<Integer> midPoint(Node<Integer> head) {
        int length=0;
        Node<Integer> p = head;
        while(p!=null){
            p=p.next;
            length++;
        }
        p = head;
        int c=0;
        while(c<length/2){
            p=p.next;
            c++;
        }
        return p;
    }

    public static Node<Integer> midPoint2(Node<Integer> head){

        if(head == null || head.next == null) return head;

        Node<Integer> s = head;
        Node<Integer> f = head;

        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
}

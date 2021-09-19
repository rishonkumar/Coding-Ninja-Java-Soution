package LinkedList;

//Time - Complexity - O(n)
public class kReverse {
    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        //Your code goes here

        if(k==0 || k==1) return head;

        int count = 0;
        Node<Integer>current = head;
        Node<Integer>prev=null;
        Node<Integer>fowd=null;
        while(current!=null && count<k){
            fowd=current.next;
            current.next=prev;
            prev=current;
            current=fowd;
            count++;
        }
        if(fowd!=null) head.next = kReverse(fowd,k);

        return prev;
    }
}

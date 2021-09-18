package LinkedList;
/*
Sample Input 1 :
1
1 4 5 2 -1
Sample Output 1 :
1 5 4 2
Sample Input 2 :
2
1 11 3 6 8 0 9 -1
10 20 30 40 -1
Sample Output 2 :
1 11 3 9 6 8 0
10 20 30 40
 */
public class Even_After_Odd_LL {

    public static Node<Integer>evenafterOdd(Node<Integer>head){

        if(head == null) return head;

        Node<Integer>oddHead = null , oddTail = null , evenHead = null , evenTail = head;

        while(head!=null){

            if(head.data%2==0){
                if(evenHead==null){
                    evenHead=head;
                    evenTail=head;
                }
                else{
                    evenTail.next=head;
                    evenTail=evenTail.next;
                }
            }
            else{
                if(oddHead==null){
                    oddHead=head;
                    oddTail=head;
                }
                else{
                    oddTail.next=head;
                    oddTail=oddTail.next;
                }
            }
            head = head.next;
        }
        if(oddHead==null) return evenHead; //if no odd then return even head
        else oddTail.next = evenHead;  //if present then link odd tail to even head

        if(evenHead!=null) evenTail.next=null; //if even head present then make evenTail to nail

        return oddHead;
    }

}

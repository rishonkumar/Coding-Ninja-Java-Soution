package LinkedList;
/*
i/p
2
3 4 5 2 6 1 9 -1
5
10 20 30 40 50 60 70 -1
6

o/p
2
-1
 */

public class FindNode {

    public static int findNode(Node<Integer>head, int n){
        Node<Integer>tempNode = head;
        int i=0;
        while (tempNode!=null){
            if(tempNode.data==n){
                return i;
            }
            i++;
            tempNode=tempNode.next;
        }
        return -1;
    }

    public static int findNode2(Node<Integer>head, int n){
        Node<Integer>tempNode = head;
        int pos=0;
        while (head!=null){
            if(head.data.equals(n))
                return pos;

            head=head.next;
            pos++;
        }
        return -1;
    }

}

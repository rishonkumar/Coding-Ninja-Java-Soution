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

    public static int findNode(Node<Integer> head, int n) {
        Node<Integer> tempNode = head;
        int i = 0;
        while (tempNode != null) {
            if (tempNode.data == n) {
                return i;
            }
            i++;
            tempNode = tempNode.next;
        }
        return -1;
    }

    public static int findNode2(Node<Integer> head, int n) {
        Node<Integer> tempNode = head;
        int pos = 0;
        while (head != null) {
            if (head.data.equals(n))
                return pos;

            head = head.next;
            pos++;
        }
        return -1;
    }

    public static int findNodeRecursive(Node<Integer> head, int n) {
        if(head == null) return -1;

        if(head.data.equals(n)) return 0;

        int smallAns = findNodeRecursive(head.next,n);

        if(smallAns==-1) // head is reached null no element found
            return -1;
        else
            return smallAns+1; // add 1 coz we called recusrive from node 1


    }

}

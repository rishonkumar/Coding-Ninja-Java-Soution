package LinkedList;

/*
i/p: 2
1 2 3 4 5 -1
3
10 20 30 40 50 60 -1
5

3 4 5 1 2
20 30 40 50 60 10

1
10 6 77 90 61 67 100  -1
4

90 61 67 100 10 6 77
 */
public class AppendLastNToFirst {

    public static int Length(Node<Integer> head) {
        Node<Integer> temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {

        if (n == 0 || head == null)
            return head;

        Node<Integer> newHead = head;
        Node<Integer> newTail = head;
        Node<Integer> tail = head; // To traverse a Linked list
        int l = Length(head);
        int count = 1;
        n = n % l;

        while (tail.next != null) {
            if (count == l - n)
                newTail = tail;
            if (count == l - n + 1)
                newHead = tail;

            tail = tail.next;
            count++;
        }
        newTail.next = null;
        tail.next = head;

        return newHead;
    }

    public static Node<Integer> appendLastNToFirst2(Node<Integer> head, int n){

        if(n==0 || head==null) return head;
        Node<Integer>fast = head;
        Node<Integer>slow = head;
        Node<Integer>initalHead = head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node<Integer>tempNode = slow.next;
        slow.next = null;
        fast.next = initalHead;
        head = tempNode;

        return head;
    }



}


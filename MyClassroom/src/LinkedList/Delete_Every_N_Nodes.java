package LinkedList;

public class Delete_Every_N_Nodes {


    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        //Your code goes here
        if(head == null || M==0)
            return null;
        if(N==0)
            return head;


        Node<Integer>currentNode=head;
        Node<Integer>temp=null;

        while(currentNode!=null) {
            int take = 0;
            int skip = 0;

            while (currentNode != null && take < M) {
                if (temp == null) {
                    temp = currentNode;
                } else {
                    temp.next = currentNode;
                    temp=currentNode;
                }
                currentNode = currentNode.next;
                take++;
            }
            while (currentNode != null && skip < N) {
                currentNode = currentNode.next;
                skip++;
            }
        }
        if(temp!=null) temp.next=null;

        return head;
    }
}

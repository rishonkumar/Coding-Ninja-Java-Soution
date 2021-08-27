import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}


class Result {

    /*
     * Complete the 'condense' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST head as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode condense(SinglyLinkedListNode head) {
        // Write your code here
        SinglyLinkedListNode c = head;
        SinglyLinkedListNode index=null;
        SinglyLinkedListNode temp=null;

        if(head==null)
            return head;
        while(c!=null){
            temp = c;
            index = c.next;

            while(index!=null){
                if(c.data==index.data){
                    temp.next=index.next;
                }
                else{
                    temp=index;
                }
                index=index.next;
            }
            c=c.next;
        }
        return head;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {

            SinglyLinkedList head = new SinglyLinkedList();

            int headCount = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, headCount).forEach(i -> {
                try {
                    int headItem = Integer.parseInt(bufferedReader.readLine().trim());

                    head.insertNode(headItem);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            SinglyLinkedListNode result = Result.condense(head.head);

            SinglyLinkedListPrintHelper.printList(result, "\n", bufferedWriter);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}


package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections {
    public static void main(String[] args) {
 //    Queue<Integer> queue = new Queue<Integer>();queue collections is interface and can not create object

        Queue<Integer> queue = new LinkedList<Integer>(); //linkedlist class use queue
        queue.add(10);
        queue.add(20);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}

package Queue;

import java.util.Queue;

public class Reverse_Queue {
    public static void reverseQueue(Queue<Integer>input){
        if(input.size()<=1) return; //base condition

        int front = input.poll(); //poop the first element
        reverseQueue(input); //poop rest of the element in the recursion

        input.add(front);

    }
}

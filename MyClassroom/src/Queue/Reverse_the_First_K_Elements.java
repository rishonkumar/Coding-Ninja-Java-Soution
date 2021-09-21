package Queue;

import java.util.Queue;
import java.util.Stack;

public class Reverse_the_First_K_Elements {

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {

        if(input.isEmpty() || k > input.size())
            return input;
        Stack<Integer> stack = new Stack<>();
        for(int i=0 ; i<k ; i++){
            stack.push(input.peek());
            input.remove();
        }
        while(!stack.isEmpty()){
            input.add(stack.peek());
            stack.pop();
        }

        for(int i=0 ; i<input.size()-k;i++){
            input.add(input.poll());
        }
        return input;
    }
}

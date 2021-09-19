package Stacks;

import java.util.Stack;

public class Reverse_Stack {

    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {

        if(input.size()<=1)
            return;

        int lastElement = input.pop();

        reverseStack(input, extra);

        while(!input.isEmpty()){
            int top = input.pop(); //pop element in stack and store it in top
            extra.push(top); //push the top into helper
        }
        input.push(lastElement); //push the last element

        while(!extra.isEmpty()){
            int top = extra.pop(); //now pop element from the helper and store in top
            input.push(top); // push the top element in the stack
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,6,7,1,9};
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        for(int elem : arr){
            stack.push(elem);
        }


        reverseStack(stack,helper);

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }


}

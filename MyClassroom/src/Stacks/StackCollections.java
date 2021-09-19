package Stacks;

import java.util.Stack;

public class StackCollections {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int a[] = {1,2,3,4,5};
        for(int elem : a){
            stack.push(elem);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

//        stack.push(10);
//        System.out.println( "Size of the stack " + stack.size());
//        System.out.println(" Top of the element " + stack.peek()); // top of the element
//        System.out.println(" Popped element " + stack.pop()); // it will pop and return the popped element
//        System.out.println( "Size of the stack " + stack.size());
//        System.out.println(stack.isEmpty());

    }
}

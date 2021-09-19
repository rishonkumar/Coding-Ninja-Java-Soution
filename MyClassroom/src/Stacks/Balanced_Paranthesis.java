package Stacks;

import java.util.Stack;

public class Balanced_Paranthesis {

    public static boolean isBalanced(String s){

        Stack<Character>st = new Stack<>();

        for(char it : s.toCharArray()){
            if((it == '(') || (it == '[') || (it == '{'))
                st.push(it);

            else{
                if(st.isEmpty()) return false;
                char ch = st.pop(); //pop the element and store it in ch
                if((it == ')' && ch == '(') || (it == '}' && ch == '{') || (it == ']' && ch == '['))
                    continue;
                else
                    return false;

            }
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        String expr = "([{}])";

        // Function call
        if (isBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}

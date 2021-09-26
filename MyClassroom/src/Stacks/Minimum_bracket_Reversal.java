package Stacks;

import java.util.Stack;

public class Minimum_bracket_Reversal {
    public static int countBracketReversal(String input){
        int len = input.length();

        if(len == 0 ) return 0;

        if(len%2!=0) return -1;

        Stack<Character> stk = new Stack<>();
        for(int i=0;i<len;i++){
            char currentChar = input.charAt(i);

            if(currentChar == '{')
                stk.push(currentChar);
            else{
                if(!stk.isEmpty() && stk.peek() =='{')
                    stk.pop();
                else
                    stk.push(currentChar);

            }
        }
        int count = 0;

        while(!stk.isEmpty()){
            char c1 = stk.pop();
            char c2 = stk.pop();

            if(c1!=c2){
                count+=2;
            }

            else{
                count+=1;
            }

        }
        return count;
    }

    public static void main(String[] args) {

        String exp = "{{}}}}{{";
        System.out.println(countBracketReversal(exp));
    }

}

package Stacks;
import java.util.Stack;

public class Redundant_Brackets {

    public static boolean checkReduant(String expression){

        Stack<Character> stack = new Stack<>();
        int c=0;

        for(int i=0;i<expression.length();i++){
            char store = expression.charAt(i);

            if(store == ')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    c++;
                    stack.pop();
                }
                if(c==0 || c==1)
                    return true;

                stack.pop(); // last bracket
                c=0;
            }
            else
                stack.push(store);
        }
        return false;
    }

    public static void main(String[] args)
    {
        String str = "((a+b))";
        System.out.println(checkReduant(str));

//        str = "(a+(b)/c)";
//        System.out.println(checkRedundancy(str));
//
//        str = "(a+b*(c-d))";
//        System.out.println(checkRedundancy(str));
    }
}

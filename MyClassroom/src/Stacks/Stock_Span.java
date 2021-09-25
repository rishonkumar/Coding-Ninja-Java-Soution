package Stacks;

import java.util.Stack;

public class Stock_Span {
    public static int[] stockSpanBruteForce(int[] price) {

        int n = price.length;
        int ans[] = new int[n];

        ans[0]=1; //First value is always one

        for(int i=1; i<n; i++){
            ans[i] = 1;  //initliaze with 1
            for(int j=i-1; j>=0 && price[i]>price[j]; j--){
                ans[i]++; //keep increment if condition satisfy
            }
        }
        return ans;
    }

    public static int[] stockSpan(int[] price){

        int n = price.length;
        int[] spans = new int[n]; //output array

        Stack<Integer>indexStack = new Stack<>();

        //push the first element in the stack
        indexStack.push(0);
        spans[0] = 1; // store index 1 of span as 1 coz it's always 1

        for(int i=1 ;i<n;i++){
            while(!indexStack.isEmpty() && price[i]>price[indexStack.peek()]){
                indexStack.pop();
            }

            if(indexStack.isEmpty()){
                spans[i] = i+1;
            }
            else{
                spans[i] = i - indexStack.peek();
            }
            indexStack.push(i);
        }

        return spans;
    }

}

package Stacks;

public class Stock_Span {
    public static int[] stockSpanBruteForce(int[] price) {

        int n = price.length;
        int ans[] = new int[n];

        ans[0]=1; //First value is alaways one

        for(int i=1; i<n; i++){
            ans[i] = 1;  //initliaze with 1
            for(int j=i-1; j>=0 && price[i]>price[j]; j--){
                ans[i]++; //keep increment if condition satisfy
            }
        }
        return ans;
    }

   /* public static int[] stockSpan(int[] price){

        Stack<Integer>stack = new Stack<>();

        for(int i=0;i<price.length;i++){

        }
    }*/

}

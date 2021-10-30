
// https://leetcode.com/problems/perfect-squares/
package Dynamic_Programming;


import java.util.Arrays;

public class Min_Squares_N {

    public int numSquares1(int n) {

        //Recursive approach
        if (n == 0)
            return 0;

        int minAns = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            int currAns = numSquares1(n - (i * i));

            if (minAns > currAns) {
                minAns = currAns;
            }
        }
        int myAns = 1 + minAns;
        return myAns;
    }

    // Dp Memoization approach
    public int numSquares2(int n) {

        if (n == 0) {
            return 0;
        }

        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        int minAns = Integer.MAX_VALUE;

        for (int i = 1; i*i <= n; i++) {
            int currAns;
            if (dp[n - (i * i)] == -1) {
                currAns = numSquares2(n - (i * i));
                dp[n - (i * i)] = currAns;
            } else {
                currAns = dp[n - (i * i)];
            }
            if(minAns > currAns){
                minAns = currAns;
            }
        }
        int myAns = 1 + minAns;
        return myAns;
    }

    // Dp iterative

    public int numSquares(int n){

        int[] dp = new int[n+1];

        Arrays.fill(dp , Integer.MAX_VALUE);

        dp[0] = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j*j<=i;i++){
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}

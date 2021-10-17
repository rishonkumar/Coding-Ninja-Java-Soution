package Dynamic_Programming;

import java.util.Scanner;

public class Fibonacci {


    //Iterative approach
    public static int fib1(int n) {

        if (n == 0 || n == 1)
            return n;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        //n>=2
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static int fib(int n, int[] dp) {

        if (n == 0 || n == 1)
            return n;

        int a1, a2;

        if (dp[n - 1] == -1) {
            a1 = fib(n - 1, dp);
            dp[n - 1] = a1; //store the value in dp
        } else {
            a1 = dp[n - 1];
        }

        if (dp[n - 2] == -1) {
            a2 = fib(n - 2, dp);
            dp[n - 2] = a2; //store the value in dp
        } else {
            a2 = dp[n - 2];
        }

        int myAns = a1 + a2;

        return myAns;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        int ans = fib(n, dp);
        System.out.println(ans);
    }
}

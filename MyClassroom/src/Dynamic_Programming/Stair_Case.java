package Dynamic_Programming;

public class Stair_Case {

    public static long staircase1(int n) {

        if (n < 0)
            return 0;

        if (n == 1)
            return 1;

        long dp[] = new long[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];

    }

    public static long staircase(int n) {

        if (n < 0)
            return 0;

        if (n == 0)
            return 1;

        return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
    }

    public static void main(String[] args) {

        System.out.println(staircase(10));
    }
}

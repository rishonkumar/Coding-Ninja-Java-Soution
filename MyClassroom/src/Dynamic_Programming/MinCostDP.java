package Dynamic_Programming;

public class MinCostDP {

    public static int minCostPath(int[][] input) {

        int m = input.length;
        int n = input[0].length;

        int[][] dp = new int[m + 1][n + 1];
        for (int row = 0; row < dp.length; row++) {
            for (int col = 0; col < dp[0].length; col++) {
                dp[row][col] = Integer.MIN_VALUE; //cant be min value so
            }
        }

        return minCostPath(input, 0, 0,dp);

    }

    public static int minCostPath(int[][] input, int i, int j,int[][]dp) {

        int m = input.length;
        int n = input[0].length;

        if (i == m - 1 && j == n - 1)
            return input[i][j];

        if (i >= m || j >= n)
            return Integer.MAX_VALUE;

        int a1, a2, a3;

        if (dp[i + 1][j] == Integer.MIN_VALUE) {
            a1 = minCostPath(input, i + 1, j,dp);
            dp[i + 1][j] = a1;
        } else {
            a1 = dp[i + 1][j];
        }

        if (dp[i][j + 1] == Integer.MIN_VALUE) {
            a2 = minCostPath(input, i, j + 1,dp);
            dp[i][j + 1] = a2;
        } else {
            a2 = dp[i][j + 1];
        }

        if (dp[i + 1][j + 1] == Integer.MIN_VALUE) {
            a3 = minCostPath(input, i + 1, j + 1,dp);
            dp[i + 1][j + 1] = a3;
        } else {
            a3 = dp[i + 1][j + 1];
        }

        int myAns = input[i][j] + Math.min(a1, Math.min(a2, a3));

        return myAns;
    }

    public static void main(String[] args) {

        int[][] cost = {{1, 5, 11}, {8, 13, 12}, {15, 16, 18}};
        int ans = minCostPath(cost);
        System.out.println(ans);
    }
}

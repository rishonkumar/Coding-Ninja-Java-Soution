package Dynamic_Programming;

public class MinCostDpIterative {

    public static int minCost(int[][] cost) {

        int m = cost.length;
        int n = cost[0].length;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if(i==m-1 && j==n-1){
                    dp[i][j] = cost[i][j];
                    continue;
                }
                int ans1 = dp[i][j + 1];
                int ans2 = dp[i+1][j+1];
                int ans3 = dp[i+1][j];
                dp[i][j] = cost[i][j] + Math.min(ans1 , Math.min(ans2,ans3));
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {

        int[][] cost = {{1, 5, 11}, {8, 13, 12}, {15, 16, 18}};
        int ans = minCost(cost);
        System.out.println(ans);
    }
}

package Dynamic_Programming;

public class Loot_Case {

    public static int maxMoneyLooted(int[] house) {

        int n = house.length;

        if(n==0)
            return 0;

        if(n==1)
            return house[0];

        if(n==2)
            return Math.max(house[0],house[1]);

        int[] dp = new int[n+1];
        dp[0] = house[0];
        dp[1] = Math.max(house[0],house[1]);
        for(int i=2;i<n;i++){
            //Current value is taken
            int max1 = dp[i-2] + house[i];
            int max2 = dp[i-1];
            dp[i] = Math.max(max1,max2);
        }
        return dp[n-1];

    }
}

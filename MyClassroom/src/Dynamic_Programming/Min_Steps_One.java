package Dynamic_Programming;

public class Min_Steps_One {


    //recursive approach
    public static int countMinStepsToOneRecursive(int n) {

        if(n<=1)
            return 0;

        else if(n==2 || n==3)
            return 1;

        int o1 = countMinStepsToOneRecursive(n-1);
        int o2 = Integer.MAX_VALUE;
        int o3 = Integer.MAX_VALUE;

        if(n%2==0)
            o2 = countMinStepsToOneRecursive(n/2);

        if(n%3==0)
            o3 = countMinStepsToOneRecursive(n/3);

        return Math.min(Math.min(o2,o3),o1)+1;
    }

    //Using dp
    public static int countMinStepsToOne(int n) {

        if(n==0 | n==1)
            return 0;

        else if(n==2 || n==3)
            return 1;

        int[]dp = new int[n+1];

        for(int i=0 ; i<n+1;i++){
            dp[i]=-1;
        }

        //base case
        dp[1]=0;
        dp[2]=1;
        dp[3]=1;

        for(int i=4;i<=n;i++){

            int a1 = dp[i-1];
            int a2 = Integer.MAX_VALUE , a3 = Integer.MAX_VALUE;

            if(i%2==0)
                a2 = dp[i/2];

            if(i%3==0)
                a3 = dp[i/3];

            dp[i] = Math.min(a1, Math.min(a2,a3))+1;
        }


        return dp[n];

    }

}

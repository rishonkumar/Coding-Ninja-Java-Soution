package Dynamic_Programming;

public class MinCostRecursive {

    public static int minCostPath(int[][] input) {

        return minCostPath(input,0,0);

    }

    static int minCostPath(int[][] input, int i, int j) {
        //Your code goes here
        int n = input.length;
        int m = input[0].length;

        //Special case

        if(i==m-1 && j==n-1)
            return input[i][j];

        //Base case
        if(i>=m ||j>=n)
            return Integer.MAX_VALUE;

        int ans1 = minCostPath(input,i,j+1);
        int ans2 = minCostPath(input,i+1,j);
        int ans3 = minCostPath(input,i+1,j+1);


       int myAns = input[i][j] + Math.min(ans1 , Math.min(ans2,ans3));
       return myAns;
    }


    public static void main(String[] args) {

        int[][]cost = {{1,5,11},{8,13,12},{15,16,18}};
        int ans = minCostPath(cost);
        System.out.println(ans);
    }
}

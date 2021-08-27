package LeetCode;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaximumWealth {

    public int maximumWealth(int[][] accounts) {

        //int r=accounts.length;
        //int c=accounts[r].length;
        int ans=Integer.MIN_VALUE;

        for(int[] r:accounts){ //for (int i=0;i<r;i++)
            int rowSum=0;
            for(int c: r) { //for(int j=0;j<c;j++)
                rowSum+=c;
            }
            if(rowSum>ans)
                ans=rowSum;
        }
        return ans;
    }
}

package Dynamic_Programming;

public class Longest_Common_Subsequence {


    public static void main(String[] args) {

        String s1 = "bedgmc";
        String s2 = "abdfglc";

        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        int ans = lcsrc(s1, s2, 0, 0);
        int ans1 = lcs(s1, s2, 0, 0, dp);
        System.out.println(ans);
        System.out.println(ans1);
    }

    private static int lcs(String s1, String s2, int i, int j, int[][] dp) {

        if (i == s1.length() || j == s2.length())
            return 0;

        int myAns;
        if (s1.charAt(i) == s2.charAt(j)) {
            int smallAns;
            if (dp[i + 1][j + 1] == -1) {
                smallAns = lcs(s1, s2, i + 1, j + 1, dp);
                dp[i + 1][j + 1] = smallAns;
            } else {
                smallAns = dp[i + 1][j + 1];
            }
            myAns = 1 + smallAns;

        } else {
            int a1,a2;
            if (dp[i + 1][j] == -1){
                a1 = lcs(s1, s2, i + 1, j, dp);
                dp[i+1][j]=a1;
            }else{
                a1 = dp[i+1][j];
            }

            if (dp[i][j+1] == -1){
                a2 = lcs(s1, s2, i, j + 1, dp);
                dp[i][j+1]=a2;
            }else{
                a2 = dp[i][j+1];
            }
            myAns = Math.max(a1, a2);
        }

        return myAns;
    }

    //Recursive appraoch
    static int lcsrc(String s1, String s2, int i, int j) {

        if (i == s1.length() || j == s2.length())
            return 0;

        int myAns;
        if (s1.charAt(i) == s2.charAt(j)) {

            int smallAns = lcsrc(s1, s2, i + 1, j + 1);
            myAns = 1 + smallAns;
        } else {

            int a1 = lcsrc(s1, s2, i + 1, j);
            int a2 = lcsrc(s1, s2, i, j + 1);

            myAns = Math.max(a1, a2);
        }

        return myAns;
    }


}

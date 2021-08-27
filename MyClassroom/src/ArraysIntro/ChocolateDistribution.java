package ArraysIntro;
import java.util.Arrays;
import java.util.Scanner;
//https://www.geeksforgeeks.org/chocolate-distribution-problem/
public class ChocolateDistribution {

    public static int find(int[]arr , int n , int m){

        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<=n-m;i++){
            int maxw=arr[i+m-1];
            int minw=arr[i];
            int diff=maxw-minw;

            if(diff<ans)
                ans=diff;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int m = s.nextInt();
        int ans = find(arr,n,m);
        System.out.println(ans);
    }
}

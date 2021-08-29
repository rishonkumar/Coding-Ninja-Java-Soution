package ArraysIntro;

import java.util.Scanner;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if(n==0)
            return nums;
        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        leftsum[0] = 1;
        for (int i = 1; i < n; i++) {
            leftsum[i] = leftsum[i - 1] * nums[i - 1];
        }
        rightsum[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightsum[i] = rightsum[i + 1] * nums[i + 1];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = leftsum[i] * rightsum[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] res = productExceptSelf(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

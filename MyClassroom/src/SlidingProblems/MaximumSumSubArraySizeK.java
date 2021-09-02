package SlidingProblems;

//https://www.geeksforgeeks.org/window-sliding-technique/
public class MaximumSumSubArraySizeK {

    public static int getMaxSubbarySum(int[] a, int n, int k) {
        int i = 0; //start
        int j = 0;//end;
        int sum = 0;
        int MaxSum = Integer.MIN_VALUE;
        while (j < n) {
            sum = sum + a[j];
            if (j - i + 1 == k) {
                MaxSum = Math.max(MaxSum, sum);
                sum = sum - a[i];
                i++;
            }
            j++;
        }
        return MaxSum;
    }
    public static void main(String[] args) {

        int a[] = {2, 7, 3, 6, 7, 7};
        int k = 2;
        int n = a.length;
        System.out.print(getMaxSubbarySum(a, n, k));
    }
}

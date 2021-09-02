package SlidingProblems;
//https://www.geeksforgeeks.org/window-sliding-technique/
public class MaximumSumSubArraySizeK {

    public static void main(String[] args) {

        int a[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int n = a.length;
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
        System.out.print(MaxSum);
    }
}

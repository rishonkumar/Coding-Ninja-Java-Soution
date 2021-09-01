package Recursion;

public class SortedArray {

    public static boolean isSorted(int a[]) {
        int n = a.length;
        if (n == 1) return true;
        if (a[0] > a[1]) return false;
        int smallArray[] = new int[n - 1];
        for (int i = 1; i < n; i++) {
            smallArray[i - 1] = a[i];
        }
        boolean isSmallArraySorted = isSorted(smallArray);
        return isSmallArraySorted;
    }

    public static boolean isSortedBetter(int arr[], int StartIndex) {
        if (StartIndex == arr.length - 1) return true;
        if (arr[StartIndex] > arr[StartIndex + 1]) return false;
        boolean isSmallerArraySorted = isSortedBetter(arr, StartIndex + 1);
        return isSmallerArraySorted;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 42, 5, 6};
        System.out.print(isSorted(arr));
    }
}

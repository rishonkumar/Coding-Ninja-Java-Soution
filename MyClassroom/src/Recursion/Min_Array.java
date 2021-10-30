package Recursion;

public class Min_Array {

    public static int findMin(int arr[], int startIndex) {

        if (startIndex == arr.length)
            return Integer.MAX_VALUE;

        int minSmallArray = findMin(arr, startIndex + 1);

        if (arr[startIndex] < minSmallArray)
            return arr[startIndex];

        else
            return minSmallArray;

    }

    static void printMin1(int[] a) {

        int min = findMin(a, 0);
        System.out.println(min);
    }


    public static void printMin2(int[] a, int startIndex, int minSoFar) {

        if (startIndex == a.length) {
            System.out.println(minSoFar);
            return;
        }

        int newMinimum = minSoFar;
        if (a[startIndex] < minSoFar) {
            newMinimum = a[startIndex];
        }
        printMin2(a, startIndex + 1, newMinimum);
    }

    public static void main(String[] args) {

        int[] a = {33, 24, 5, 63, 12};
        //int min = findMin(a,0);
        //printMin1(a);
        //System.out.println(min);
        printMin2(a, 0, Integer.MAX_VALUE);
    }

}

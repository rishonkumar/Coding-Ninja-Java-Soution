package ArraysIntro;

public class SumArray {

    public static void sumOf2Array(int[] a1, int[] a2, int[] output) {
        int n = a1.length;
        int m = a2.length;
        int i = n - 1;
        int j = m - 1;
        int k = Math.max(n, m);
        int c = 0;
        while (i >= 0 && j >= 0) {
            int s = a1[i] + a2[j] + c;
            output[k] = s % 10; // to take the last digit
            c = s / 10; // to take the other digit to the carry
            i--;
            j--;
            k--;
        }
        while (i >= 0) {
            int s = a1[i] + c;
            output[k] = s % 10;
            c = s / 10;
            i--;
            k--;
        }
        while (j >= 0) {
            int s = a2[j] + c;
            output[k] = s % 10;
            c = s / 10;
            j--;
            k--;
        }
        output[0] = c; // for the last number
    }

    public static void main(String[] args) {

    }
}

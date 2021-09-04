package ArraysIntro;

public class Merge_Sort {
    public static void merge(int[] s1, int[] s2, int[] d) {
        int i = 0, j = 0, k = 0;
        while (i < s1.length && j < s2.length) {
            if (s1[i] <= s2[j]) {
                d[k] = s1[i];
                i++;
                k++;
            } else {
                d[k] = s2[j];
                j++;
                k++;
            }
        }
        if (i < s1.length) {
            while (i < s1.length) {
                d[k] = s1[i];
                i++;
                k++;
            }
        }
        if(j<s2.length){
            while(j<s2.length){
                d[k] = s2[j];
                j++;
                k++;
            }
    }

}

    public static void mergesort(int[] input) {
        if (input.length <= 1) return;
        int a[] = new int[input.length / 2];
        int b[] = new int[input.length - a.length];
        //dividing the array into 2 and then copy the
        //first half in array a and rest half in b
        for (int i = 0; i < input.length/2; i++) {
            a[i] = input[i];
        }
        for (int i = input.length / 2; i < input.length; i++) {
            b[i - input.length / 2] = input[i];
        }
        mergesort(a);
        mergesort(b);
        merge(a, b, input);
    }

    public static void main(String[] args) {

    }
}

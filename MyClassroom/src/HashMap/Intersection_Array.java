package HashMap;


import java.util.Arrays;
import java.util.HashMap;


public class Intersection_Array {

    public static void Intersection(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {

            if (map.containsKey(arr1[i])) {
                int val = map.get(arr1[i]);
                map.put(arr1[i], val + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                int freq = map.get(arr2[i]);
                if (freq > 0) { // means intersection
                    System.out.print(arr2[i] + " ");
                    map.put(arr2[i], freq - 1); //reduce the freq
                }
            }
        }

    }


    public static void main(String[] args) {

        int a1[] = {2, 6, 8, 5, 4, 3};
        int a2[] = {2, 3, 4, 7};

        Intersection(a1, a2);
    }
}

package HashMap;

import java.util.HashMap;

public class Max_Frequency {

    public static int maxFrequencyNumber(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int currentElement = arr[i];

            //if already present then increment the value
            if (map.containsKey(currentElement)) {
                map.put(currentElement, map.get(currentElement) + 1);
            } else { //else add it in map
                map.put(currentElement, 1);
            }
        }
        int maxValue = arr[0];
        int maxCount = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (map.get(arr[i]) > maxCount) {
                maxCount = map.get(arr[i]);
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}

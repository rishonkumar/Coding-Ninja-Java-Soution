package ArraysIntro;

import java.util.Arrays;

public class UniqueElement {
    public static int findUnique(int[] arr) {

        int n=arr.length;
        Arrays.sort(arr);
        if(n==1)
            return arr[0];

        for(int i=0;i<n;i++){
            int j=i+1;
            if(arr[i]!=arr[j])
               return arr[j];
        }
        return -1;
    }
}

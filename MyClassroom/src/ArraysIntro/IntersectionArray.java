package ArraysIntro;

import java.util.Arrays;

public class IntersectionArray {
    //brute force approach
    public static void Intersection(int arr1[], int arr2[]) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr2[j] + " ");
                    arr2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
    }

    //Optimize approach
    public static void Interection2(int arr1[], int arr2[]){

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n1=arr1.length;
        int n2=arr2.length;

        int i=0,j=0;
        while (i<n1 && j<n2){

            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+ " ");
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }
    }
}
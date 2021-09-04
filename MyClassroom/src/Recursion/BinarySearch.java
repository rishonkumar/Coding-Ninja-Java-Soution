package Recursion;

public class BinarySearch {

    public static int binarySearch(int a[], int si , int ei, int x){
        if(si>ei) return -1;
        int midIndex=(si+ei)/2;
        if(a[midIndex]==x) return midIndex;
        else if(a[midIndex]<x) return binarySearch(a,midIndex+1,ei,x);
        else return binarySearch(a,si,midIndex-1,x);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,7,67,98};
        System.out.println(binarySearch(arr,0,arr.length-1,67));
    }
}

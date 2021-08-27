package LeetCode;

public class Ceiling {

    //return the index of smallest no >= target
    public static int CeilingOfNumber(int[]arr , int target){
        int n=arr.length;
        //but what if target is greater than greatest no in the array
        //then no ceiling
        if(target>arr[n-1])
            return -1;
        int start=0;
        int end=n-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid])
                end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else
                return mid; //If the target is found
        }
        return start; //Next element is returned
    }

    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans=CeilingOfNumber(arr,target);
        System.out.println(ans);
    }

}

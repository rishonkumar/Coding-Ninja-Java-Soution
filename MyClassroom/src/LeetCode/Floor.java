package LeetCode;

public class Floor {

    // return the index of greatest no <= target
    public static int FloorOfNumber(int[]arr , int target){
        int n=arr.length;
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
        return end;
    }

    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans=FloorOfNumber(arr,target);
        System.out.println(ans);
    }
}

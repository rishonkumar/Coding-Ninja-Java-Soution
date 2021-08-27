package LeetCode;

public class FirstLastElement {
    public int[] searchRange(int[] nums, int target) {

        int[] ans={-1,-1};
        int n=nums.length;
        int low=0;
        int high=n-1;

        //to find the first index
        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                ans[0]=mid;
                //continue searching left part
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        low=0;
        high=n-1;
        //to find the last index
        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                ans[1]=mid;
                //continue searching right part
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}

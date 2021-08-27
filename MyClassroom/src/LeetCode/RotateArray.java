package LeetCode;
//https://leetcode.com/problems/rotate-array/
public class RotateArray {

    public void reverse(int[]nums, int s, int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int rotate=k%n;
        int mid=n-rotate-1;

        reverse(nums,0,mid);//first partion
        reverse(nums,mid+1,n-1); //last partion
        reverse(nums,0,n-1); //whole partion
    }
}

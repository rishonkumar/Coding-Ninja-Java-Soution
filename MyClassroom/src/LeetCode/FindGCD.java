package LeetCode;
//Leetcode 5850

public class FindGCD {
    public int findGCD(int[] nums) {

        int min = nums[0];;
        for(int i=0; i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }

        int max = nums[0];
        for(int i=0; i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }

        while (max!=min){
            if(max>min){
                max=max-min;
            }
            else{
                min=min-max;
            }
        }
        return min;
    }
}

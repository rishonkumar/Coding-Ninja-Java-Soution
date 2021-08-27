package LeetCode;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n){

        int[] result = new int[nums.length];
        int evenIndex=0;//Start from 0
        int oddIndex=n;//Start from n
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                //if the index are even then add element in the result array from nums
                result[i]=nums[evenIndex];
                evenIndex++;
            }
            else{
                //if the index are odd then add element in the result array from nums
                result[i]=nums[oddIndex];
                oddIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4,7};
        int n= 3;
        int result[] = shuffle(arr,n);
        System.out.print(result);
    }



}

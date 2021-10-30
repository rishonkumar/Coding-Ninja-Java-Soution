package Recursion;

public class SubsetSumK {

    public static int[][] subsetSumK(int input[], int k){

        return helper(input,0,k);
    }

    public static int[][] helper(int[] input, int beginIndex, int k) {

        if(beginIndex == input.length){

            if(k==0)
                return new int[1][0];
            else
                return new int[0][0];
        }

        int[][] smallOutput1 = helper(input,beginIndex+1,k);

        int[][] smallOutput2 = helper(input,beginIndex+1,k-input[beginIndex]);
        int[][] output = new int[smallOutput1.length + smallOutput2.length][];
        int index=0;

        for(int i=0 ; i<smallOutput1.length;i++){
            output[index] = smallOutput1[i];
            index++;
        }

        for(int i=0 ; i<smallOutput2.length;i++){
            output[index] = new int [smallOutput2[i].length+1];
            output[index][0] = input[beginIndex];
            for(int j=0; j< smallOutput2[i].length;j++){
                output[index][j+1] = smallOutput2[i][j];
            }
            index++;
        }
        return output;

    }

}

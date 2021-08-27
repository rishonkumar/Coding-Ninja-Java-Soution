package ArraysIntro;

public class MaximumSumPath {
    public static long maximumSumPath(int[] input1, int[] input2){
        int n=input1.length;
        int m=input2.length;

        int i=0,j=0,sum1=0,sum2=0;
        int r=0;
        while(i<n && j<m){
            if(input1[i]<input2[j]){
                sum1+=input1[i];
                i++;
            }
            else if(input1[i]>input2[j]){
                sum2+=input2[j];
                j++;
            }
            else{
                r+=Math.max(sum1,sum2)+input1[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }
        while(i<m)
            sum1+=input1[i++];

        while(i<n)
            sum2+=input2[j++];

        r=r+Math.max(sum1,sum2);
        return r;
    }

}

package ArraysIntro;

public class SubarraySumZero {

    static boolean finSum(int[] arr){

        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==0)
                    return true;
            }
        }
        return false;
    }
}

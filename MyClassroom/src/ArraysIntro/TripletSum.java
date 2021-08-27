package ArraysIntro;

import java.util.Arrays;

public class TripletSum {

    public static int tripletSum(int[] arr, int num){
        Arrays.sort(arr);
        int n=arr.length;

        int numTriplets=0;
        for(int i=0;i<n;i++){
            int pairSumfor = num-arr[i];
            int numpair=pairSum(arr,(i+1),(n-1),pairSumfor);

            numTriplets+=numpair;
        }
        return numTriplets;
    }
    private static int pairSum(int[] arr , int startIndex, int endIndex, int num){
        int numPair=0;
        while(startIndex<endIndex){
            if(arr[startIndex]+arr[endIndex]<num){
                startIndex++;
            }
            else if(arr[startIndex]+arr[endIndex]>num){
                endIndex--;
            }else{
                int elementAtStart=arr[startIndex];
                int elementAtEnd=arr[endIndex];

                if(elementAtStart==elementAtEnd){
                    int totalELementsFromStartToend=(endIndex-startIndex)+1;
                    numPair+=(totalELementsFromStartToend*(totalELementsFromStartToend-1)/2);

                    return numPair;
                }
                int tempStartIndex=startIndex+1;
                int tempEndIndex=endIndex-1;

                while (tempStartIndex<=tempEndIndex && arr[tempStartIndex]==elementAtStart){
                    tempStartIndex++;
                }
                while (tempEndIndex>=tempStartIndex && arr[tempEndIndex]==elementAtEnd){
                    tempEndIndex--;
                }
                int totalElementformS=(tempStartIndex-startIndex);
                int totalElementfromE=(endIndex-tempEndIndex);

                numPair+=(totalElementformS*totalElementfromE);
                startIndex=tempStartIndex;
                endIndex=tempEndIndex;
            }

        }
        return numPair;
    }
    public static void main(String[] args) {

        int arr[] = {2 ,-5, 8 ,-6 ,0, 5 ,10, 11,-3};
        int num=10;
        System.out.println(tripletSum(arr,num));
    }

}

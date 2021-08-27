package ArraysIntro;

import java.util.Arrays;

public class PairSum {
    public static int sumOfN(int x){

        return (x*(x+1))/2;
    }
    public static int pairSum(int arr[], int num){
        Arrays.sort(arr);
        int count=0;
        for(int i=0,j=arr.length-1;i<j;){
            if(arr[i]+arr[j]==num){
                if(arr[i]==arr[j]){
                    int countNum=0;
                    while(i<j){
                        i++;
                        countNum++;
                    }
                    return count+sumOfN(countNum);
                }
                int counti=1,countj=1;
                while(arr[i]==arr[i+1]){
                    i++;
                    counti++;
                }
                while(arr[j-1]==arr[j] && i<j){
                    countj++;
                    j--;
                }
                i++;j--;
                count+=counti*countj;
            }
            else if(arr[i]+arr[j]>num){
                j--;
            }else{
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int arr[] = {6 ,1 ,2, 2, 2 ,2, 2, 3 ,0};
        int num=4;
        System.out.println(pairSum(arr,num));
    }
}

package ArraysIntro;

public class DuplicateElement {

    public static int findDuplicate(int[] arr){
        int n= arr.length;
        int sumofNminusTwoElement = 0;
        for(int i=0;i<n-1;i++){
            sumofNminusTwoElement +=i;
        }
        int sumofElemnt=0;
        for(int i=0;i<n;i++){
            sumofElemnt +=arr[i];
        }
        return sumofElemnt-sumofNminusTwoElement;
    }

}

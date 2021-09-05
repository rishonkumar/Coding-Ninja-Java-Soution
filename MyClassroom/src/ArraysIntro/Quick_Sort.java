package ArraysIntro;
public class Quick_Sort {
    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if(startIndex>=endIndex) return;
        int pivotIndex = parition(input,startIndex,endIndex);
        quickSort(input,startIndex,pivotIndex-1);
        quickSort(input,pivotIndex+1,endIndex);
    }
    private static int parition(int[] input, int startIndex, int endIndex) {
        int pivotElement = input[startIndex];
        int smallerNumCount = 0;
        for(int i=startIndex+1;i<=endIndex;i++){
            if(input[i]<pivotElement)
                smallerNumCount++;
        }
        int temp=input[startIndex+smallerNumCount];
        input[startIndex+smallerNumCount] = pivotElement;
        input[startIndex] = temp;
        int i=startIndex;
        int j=endIndex;
        while (i<j){
            if(input[i]<pivotElement) i++;
            else if(input[j]>=pivotElement) j--;
            else {
                temp=input[i];
                input[i]=input[j];
                input[j]=temp;
                i++;
                j--;
            }
        }
        return startIndex+smallerNumCount;
    }

    public static void quickSort(int[] input) {
         quickSort(input,0,input.length-1);
    }

    public static void main(String[] args) {
        int a[] = {34,54,67,87,112,43,67,1,3,5};
        quickSort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}

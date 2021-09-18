package ArraysIntro;

public class Push_Zero_End {

    public static void pushZerosToEnd(int[] arr){
        int nonZero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){ // if element in not zero
                int temp = arr[i];
                arr[i] = arr[nonZero];
                arr[nonZero] = temp;
                nonZero++;
            }
        }
    }

    public static void pushZerosToEnd2(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }
        while (count<arr.length){
            arr[count]=0;
            count++;
        }
    }

    public static void printArray(int []arr) {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {

        int arr[] = {3,0,8,7,0,0,1,0,6,0,2};
        pushZerosToEnd(arr);
        printArray(arr);
        System.out.println();
        pushZerosToEnd2(arr);
        printArray(arr);

    }

}

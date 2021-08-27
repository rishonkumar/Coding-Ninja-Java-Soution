package ArraysIntro;

public class Sort012 {

    public static void swap(int[] arr, int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void sort012(int[] arr){
        int n = arr.length;
        int j=0; // 0 to j-1 -> 0 area
        int i=0; // j to i-1 -> 1 area
        int k=n-1; // k+1 to end -> 2 area

        // i to k is unknown
        while(i<=k){
            if(arr[i]==0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[i]==1){
                i++;
            }
            else if(arr[i]==2){
                swap(arr,i,k);
                k--;
            }
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

        sort012(arr);
        System.out.println("Array after seggregation ");
        printArray(arr);
    }
}

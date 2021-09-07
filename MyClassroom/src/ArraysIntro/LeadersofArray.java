package ArraysIntro;

public class LeadersofArray {

    public static void leaders(int[] arr) {

        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(max<=arr[i]){
                System.out.print(arr[i]+" ");
                max=arr[i];
            }
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr= {3 ,12 ,34 ,2, 0 ,-1};
        leaders(arr);
    }


}
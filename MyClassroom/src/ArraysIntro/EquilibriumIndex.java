package ArraysIntro;

public class EquilibriumIndex {

    public static int EquilibriumArray(int[] arr){

        int n=arr.length;
        int LeftSum,Rightsum;
        int i,j;
        for(i=0;i<n;i++){
            LeftSum=0;
            for(j=0;j<i;j++){
                LeftSum+=arr[j];
            }
            Rightsum=0;
            for(j=i+1;j<n;j++){
                Rightsum+=arr[j];
            }
            if(LeftSum==Rightsum)
                return i;
        }
        return  -1;

    }

    //Optimize approach O(n)
    public static int Equilibrium(int[] arr){
        int n=arr.length;
        int Rsum=0,Lsum=0;

        //calculate total sum
        for(int i=0;i<n;i++){
            Rsum=Rsum+arr[i];
        }
        for(int i=0;i<n;i++){
            Rsum=Rsum-arr[i];

            if(Rsum==Lsum)
                return i;

            Lsum=Lsum+arr[i];
        }
        return -1;
    }

    public static void main(String[] args)
    {
        EquilibriumIndex equi = new EquilibriumIndex();
        int arr[] = { 1,-1,4};
        System.out.println(equi.EquilibriumArray(arr));
    }
}

package Array2d;

public class BoundariesDiagonalSum {

    public static int getFirstDiagonal(int[][] mat , int n){
        int cr=0;
        int cc=0;
        int sum=0;

        while (cr<n && cc<n){
            sum=sum+mat[cr][cc];
            cr++;
            cc++;
        }
        return sum;
    }

    public static int getSecondDiagonal(int[][] mat , int n){
        int cr=0;
        int cc=n-1;
        int sum=0;

        while(cr<n && cc>0){
            sum=sum+mat[cr][cc];
            cr++;
            cc--;
        }
        return sum;
    }

    public static int getBoundary(int[][] mat , int n){
        int sum=0;
        for(int i=1;i<n-1;i++){ //to avoid repeating the diagonal element start from 1->n-1
            sum=sum+mat[0][i];
            sum=sum+mat[n-1][i];
            sum=sum+mat[i][0];
            sum=sum+mat[i][n-1];
        }
        return sum;
    }

    public static void totalSum(int[][] mat) {
        int n = mat.length;
        if(n==0) {
            System.out.println(0);
            return;
        }
        int Sum = getFirstDiagonal(mat,n)+getSecondDiagonal(mat,n)+getBoundary(mat,n);
        if(n%2!=0){ // Coz if n is odd middle element is added twice in both the diagonal
            Sum=Sum-mat[n/2][n/2];
        }
        System.out.println(Sum);
    }
}

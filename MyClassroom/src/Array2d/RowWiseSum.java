package Array2d;

public class RowWiseSum {

    public static void rowWiseSum(int[][] mat) {
        int row = mat.length;


        if(row == 0)
            return;
        int col = mat[0].length;
        for(int i=0;i<row;i++){
            int rowSum = 0;
            for(int j=0;j<col;j++){
                rowSum = rowSum + mat[i][j];
            }
            System.out.print(rowSum + " ");
        }

    }

    public static void main(String[] args) {

    }
}

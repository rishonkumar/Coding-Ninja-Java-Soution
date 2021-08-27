package Array2d;

public class LargestColRowSum {

    public static void findLargest(int mat[][]){
       boolean isRow = true;
       int largestSum = Integer.MIN_VALUE;
       int num = 0;
       int row = mat.length;

       // Row wise sum
        //Check row is present or not
        if(row == 0) {
            System.out.println("row " + num + " " + largestSum);
            return;
        }
        int cols = mat[0].length;
        for(int i=0;i<row;i++){
            int sum = 0;
            for(int j = 0;j<cols;j++){
                sum = sum+mat[i][j];
            }
            if(sum > largestSum) {
                largestSum = sum;
                num = i;
            }
        }
        //Col wise sum
        for(int j=0;j<cols;j++){
            int sum = 0;
            for(int i=0;i<row;i++){
                sum = sum+mat[i][j];
            }
            if(sum > largestSum) {
                largestSum = sum;
                num = j;
                isRow = false;
            }
        }

        if(isRow)
            System.out.println("row " + num + " " + largestSum);
        else
            System.out.println("column " + num + " " + largestSum);
    }
}


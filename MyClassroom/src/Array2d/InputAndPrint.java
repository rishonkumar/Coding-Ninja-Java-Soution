package Array2d;

import java.util.Scanner;

public class InputAndPrint {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = s.nextInt();
        System.out.println("Enter the number of cols");
        int cols = s.nextInt();
        int[][] arr = new int[row][cols];

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the element " + i + "row" + j + "column");
                arr[i][j] = s.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for (int j = 0; j<cols; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }


}

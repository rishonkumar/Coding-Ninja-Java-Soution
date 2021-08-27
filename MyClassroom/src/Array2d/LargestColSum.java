package Array2d;

import java.util.Scanner;

public class LargestColSum {

    public static int[][] takeinput(){
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
        return arr;
    }

    public static int largestCol(int[][] arr){
        int row = arr.length;
        int cols = arr[0].length;
        int largest = Integer.MIN_VALUE;
        for(int j=0;j<cols;j++){
            int sum = 0;
            for(int i=0;i<row;i++){
                sum = sum+arr[i][j];
            }
            if(sum > largest)
                largest = sum;
        }
        return largest;
    }

    public static void main(String[] args) {

        int [][] arr = takeinput();
        int larColSum = largestCol(arr);
        System.out.println(larColSum);
    }
}

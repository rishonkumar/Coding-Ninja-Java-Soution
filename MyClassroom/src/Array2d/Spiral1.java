package Array2d;

public class Spiral1 {

    public static void spiralPrint1(int mat[][]) {
            int nRows = mat.length, nCol = mat[0].length;
            int minr = 0, minc = 0;
            int maxr = mat.length - 1, maxc = mat[0].length - 1;
            int count = 0;
            int tne = nRows * nCol;
            while (count < tne) {
                //left wall
                for (int i = minr, j = minc; i <= maxr && count < tne; i++) {
                    System.out.print(mat[i][j] + " ");
                }
                minc++;
                //bottom wall
                for (int i = maxr, j = minc; j <= maxr && count < tne; i++) {
                    System.out.print(mat[i][j]+ " ");
                }
                maxr--;
                //right wall
                for (int i = maxr, j = maxc; i >= minr && count < tne; i--) {
                    System.out.print(mat[i][j]+ " ");
                }
                maxc--;
                //top wall
                for (int i = minr, j = maxc; j >= minc && count < tne; j--) {
                    System.out.print(mat[i][j]+ " ");
                } minr++;
            }
    }
}

package Recursion;

public class Geometric_Sum {
    public static double findGeometricSum(int k){
        if(k==0) return 1;
            return findGeometricSum(k-1) + 1/ Math.pow(2,k);
    }
}

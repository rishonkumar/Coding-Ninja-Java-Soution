package Recursion;

import java.util.Scanner;

public class MultiplicationTwoNumber {
    public static int multiplyTwoIntegers(int m, int n) {
        if(n==0||m==0) return 0;
        int smallOuput = multiplyTwoIntegers(m,n-1);
        return smallOuput+m;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n= scn.nextInt();
        System.out.println(multiplyTwoIntegers(m,n));
    }

}

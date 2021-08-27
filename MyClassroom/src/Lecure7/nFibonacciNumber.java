package Lecure7;

import java.util.Scanner;

public class nFibonacciNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int firstno = 0;
        int secondno = 1;
        int thirdno;
        for(int i=0;i<n;i++){
            thirdno = firstno+secondno;
            firstno = secondno;
            secondno = thirdno;

        }
        System.out.println(firstno);
    }
}

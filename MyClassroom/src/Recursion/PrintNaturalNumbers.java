package Recursion;

import java.util.Scanner;

public class PrintNaturalNumbers {

    public static void print(int n){

        if(n==0) return;
        print(n-1);
        System.out.print(n+" ");
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        PrintNaturalNumbers.print(n);
    }
}

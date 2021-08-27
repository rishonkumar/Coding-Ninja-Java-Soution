package Lecture6;

import java.util.Scanner;

public class pattern27 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int i=1;
        while(i<=n){
            int space=1;
            while(space<=i-1){
                System.out.print(" ");
                space=space+1;
            }
            int star=1;
            while (star<=n){
                System.out.print("*");
                star=star+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}

package Lecture6;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        while (i<=n){
            int j=1;
            while (j <=n-i+1){
                System.out.print('*');
                j =j+1;
            }
            System.out.println();
            i = i+1;
        }
    }
}

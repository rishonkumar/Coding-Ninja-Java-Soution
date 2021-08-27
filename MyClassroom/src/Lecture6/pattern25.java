package Lecture6;

import java.util.Scanner;

public class pattern25 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int firstHalf = (n+1)/2;
        int secondHalf = (n)/2;

        //First Half code
        int i=1;
        while(i<=firstHalf){
            int space=1;
            while (space<=(firstHalf-i)){
                System.out.print(" ");
                space=space+1;
            }
            int star=1;
            while(star<=(2*i)-1){
                System.out.print("*");
                star=star+1;
            }
            System.out.println();
            i=i+1;
        }
        //Seconf half
        i = secondHalf;
        while (i>=1){
            int space=1;
            while (space<=(secondHalf-i+1)){
                System.out.print(" ");
                space=space+1;
            }
            int star=1;
            while (star<=(2*i)-1){
                System.out.print("*");
                star=star+1;
            }
            System.out.println();
            i=i-1;
        }
            
    }
}

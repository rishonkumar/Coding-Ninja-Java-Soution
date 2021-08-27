package Lecture6;
import java.util.Scanner;
public class pattern26 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println("*");

        int i=1;
        while(i<=n){
            System.out.print("*");
            int j=1;
            while(j<=i){
                System.out.print(j);
                j=j+1;
            }
            j=j-2;
            while(j>=1){
                System.out.print(j);
                j=j-1;
            }
            System.out.println("*");
            i=i+1;
        }

        i=1;
        while(i<=n-1){
            System.out.print("*");

            int j=1;
            while(j<=n-i){
                System.out.print(j);
                j=j+1;
            }
            j=j-2;
            while(j>=1){
                System.out.print(j);
                j=j-1;
            }
            System.out.println("*");
            i=i+1;
        }
        System.out.print("*");
    }
}

package Lecure7;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=1;
        while(a*a<=n){
            a++;
        }
        a= a-1;
        System.out.println(a);
    }
}

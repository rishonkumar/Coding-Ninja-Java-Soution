package Lecture6;

import java.util.Scanner;

public class pattern28 {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                if (i == j) {
                    System.out.print("=");
                } else {
                    System.out.print("+");
                }
                j = j + 1;
            }
            System.out.println(sum);
            i=i+1;
        }
    }

}

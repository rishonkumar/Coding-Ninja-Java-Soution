package Lecture6;

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
                int space=1;
                while(space<=n-i){
                    System.out.print(' ');
                    space = space + 1;
                }
                int num = 1;
                while(num<=i){
                    System.out.print(num);
                    num = num + 1;
                }

                int dec = i-1;
                while(dec>=1){
                    System.out.print(dec);
                    dec = dec - 1;
                }
                System.out.println();
                i = i+1;
        }
    }

}

package Lecture6;

import java.util.Scanner;

public class pattern23 {
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
                int print = i;
                while(num<=i){
                    System.out.print(print);
                    print = print+1;
                    num = num + 1;
                }

                num = 1;
                print = 2*i-1;
                while(num<=i-1){
                    System.out.print(print);
                    print = print-1;
                    num = num+1;
                }
                System.out.println();
                i = i+1;
        }
    }

}

package Lecture4;

import java.util.Scanner;

public class checkPrimality {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int div = 2;
        boolean isPrime = true;
        while(div <= n/2){  // n/2 coz they exits in pair e.g 2 and 8 for 16
            if(n%div == 0){
                isPrime = false;

            }
            div = div+1;
        }
        if(isPrime == true){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Composite");
        }
    }
}

package Lecture4;

import java.util.Scanner;

public class EvenOddDigit {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int Esum = 0;
        int Osum = 0;

        while (n>0){
            int lastDigit = n%10;
            if(lastDigit %2 ==0){
                Esum = Esum + lastDigit;
            }
            else{
                Osum = Osum + lastDigit;
            }
            n = n/10;
        }
        System.out.println(Esum + " " + Osum);
    }
}

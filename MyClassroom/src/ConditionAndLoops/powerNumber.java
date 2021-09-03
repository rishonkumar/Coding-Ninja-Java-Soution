package ConditionAndLoops;

import java.util.Scanner;

public class powerNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int ans = 1;
        int x = scn.nextInt();
        int n = scn.nextInt();

        while(n>0){
            ans = ans*x;
            n--;
        }
        System.out.println(ans);
    }
}

package Recursion;

import java.util.Scanner;

public class Power {

    public static int power(int x , int n){
        if(n==0) return 1;
        if(n==1) return x;
        int smallerOutput = power(x,n-1);
        int output = smallerOutput*x;
        return output;
    }

    public static int power2(int x , int n){
        if(n==0) return 1;
        if(n==1) return x;
        int temp = power2(x,n/2);
        if(n%2==0) return temp*temp;
        else return x*temp*temp;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();

        System.out.println(power(x, n));
    }
}

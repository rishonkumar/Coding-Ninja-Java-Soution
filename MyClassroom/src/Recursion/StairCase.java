package Recursion;

import java.util.Scanner;

public class StairCase {
    public static int stairCase(int n){
        if(n<0) return 0;
        else if(n==0) return 1;
        return stairCase(n-1)+stairCase(n-2)+stairCase(n-3);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(stairCase(n));
    }
}

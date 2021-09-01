package Recursion;

import java.util.Scanner;

public class SearchNumber {

    public static boolean checkNumber2(int input[], int x, int index){
        if(index == input.length)  return false;
        if (input[index] == x) return true;
        return checkNumber2(input,x,index+1);
    }

    public static boolean checkNumber(int input[] , int x){
        return checkNumber2(input , x , 0);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(checkNumber(input, x));
    }
}

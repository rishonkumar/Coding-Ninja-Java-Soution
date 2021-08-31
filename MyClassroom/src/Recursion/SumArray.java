package Recursion;

import java.util.Scanner;

public class SumArray {
    public static int sum(int input[], int index){
        // from zero to n index
        if(index==input.length) return 0;
        return input[index] + sum(input,index+1);
    }
    public static int sum(int input[]){
        return sum(input,0);
    }
    public static int sum1(int input[], int index){
        //from n to zero index
        if(index<0) return 0;
        return input[index] + sum(input, index-1);
    }
    public static int sum1(int input[]){
        return sum1(input, input.length-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.println(sum(input));
        System.out.println(sum1(input));
    }
}

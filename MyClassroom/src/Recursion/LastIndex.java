package Recursion;

import java.util.Scanner;

public class LastIndex {

    public static int lastIndex1(int input[] , int x , int index){
        if(index<0) return -1;
        if(input[index] == x) return index;
        return lastIndex1(input,x,index-1);
    }

    public static int lastIndex(int input[] , int x){
        return lastIndex1(input,x,input.length-1);
    }
    static Scanner s = new Scanner(System.in);
    public static int[] takeInput() {
        int size = s.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = s.nextInt();
        System.out.println(lastIndex(input, x));
    }
}

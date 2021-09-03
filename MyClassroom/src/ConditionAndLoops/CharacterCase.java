package ConditionAndLoops;

import java.util.Scanner;

public class CharacterCase {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        char c = scn.next().charAt(0);
        if(c >= 'A' && c <= 'Z'){
            System.out.println("1");
        }
        else if(c >= 'a' && c<= 'z'){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }
    }
}

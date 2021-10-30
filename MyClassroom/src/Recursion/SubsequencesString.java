package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequencesString {
    public static void main(String[] args) {
        //System.out.println(subsequences("abc"));

        Scanner scn = new Scanner(System.in);
        String input = scn.next();
        String[] output = subsequences1(input);
        for (String outputString : output) {
            System.out.println(outputString);
        }
    }

    private static ArrayList<String> subsequences(String str) {
        //base case
        if (str.length() == 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        char ch = str.charAt(0); //a
        String ros = str.substring(1); //bc
        ArrayList<String> res = subsequences(ros);
        ArrayList<String> mr = new ArrayList<>();
        for (String val : res) {
            mr.add(val);
            mr.add(ch + val);
        }
        return mr;
    }

    public static String[] subsequences1(String s) {

        //base case
        if (s.length() == 0) {
            String[] output = new String[1];
            output[0] = "";
            return output;
        }
        String[] smallOutput = subsequences1(s.substring(1));
        String[] output = new String[smallOutput.length * 2];

        for (int i = 0; i < smallOutput.length; i++) {
            output[i] = smallOutput[i];
            output[smallOutput.length + i] = s.charAt(0) + smallOutput[i];
        }
        return output;
    }
}

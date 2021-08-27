package String;

import java.util.Scanner;

public class ListPartioning {

    public static void swap(String[] strs ,int i , int j){

        String temp="";
        temp = strs[i];
        strs[i] = strs[j];
        strs[j] = strs[i];
    }
    public String[] solve(String[] strs) {

        int n = strs.length;
        int i = 0; //red;
        int j = 0; //green
        int k = n - 1; //blue

        while (i <= k) {

            if (strs[i].contains("red")) {
                swap(strs, i, j);
                i++;
                j++;
            } else if (strs[i].contains("green")) {
                i++;
            } else if (strs[i].contains("blue")) {
                swap(strs, i, k);
                k--;
            }
        }
        return strs;

    }

    public static void main(String[] args) {

    }
}

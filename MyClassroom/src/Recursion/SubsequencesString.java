package Recursion;

import java.util.ArrayList;

public class SubsequencesString {
    public static void main(String[] args) {
        System.out.println(subsequences("abc"));
    }

    private static ArrayList<String> subsequences(String str) {
        //base case
        if(str.length()==0){
            ArrayList<String>br = new ArrayList<>();
            br.add("");
            return br;
        }
        char ch = str.charAt(0); //a
        String ros = str.substring(1); //bc
        ArrayList<String> res = subsequences(ros);
        ArrayList<String> mr = new ArrayList<>();
        for(String val:res){
            mr.add(val);
            mr.add(ch+val);
        }
        return mr;
    }
}

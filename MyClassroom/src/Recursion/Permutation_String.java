package Recursion;

import java.util.ArrayList;

public class Permutation_String {

    public static void main(String[] args) {


        System.out.println(getPermutation("abc"));
    }

    public static ArrayList<String> getPermutation(String str) {


        if (str.length() == 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        char ch = str.charAt(0); //store the first character "a"

        String ros = str.substring(1); // Rest of the string abc -> bc

        ArrayList<String> rr = getPermutation(ros); //recursion result

        ArrayList<String> mr = new ArrayList<>(); //My result


        // recursion result loop
        for (String rrs : rr) {
            //now add ch in different pos in rrs

            for (int i = 0; i <= rrs.length(); i++) {

                String val = rrs.substring(0, i) + ch + rrs.substring(i);
                mr.add(val);
            }
        }
        return mr;
    }

    public static String[] permutationOfString(String input) {

        if(input.length()==0){
            String[] output = {""};
            return output;
        }

        String[] smallerOuput = permutationOfString(input.substring(1));

        String output[] = new String[input.length()* smallerOuput.length];

        int k=0;

        for(int i=0; i< smallerOuput.length;i++){
            String currentString = smallerOuput[i];

            for(int j=0 ; j<=currentString.length(); j++){
                output[k] = currentString.substring(0,j) + input.charAt(0) + currentString.substring(j);
                k++;
            }
        }
        return output;
    }
}

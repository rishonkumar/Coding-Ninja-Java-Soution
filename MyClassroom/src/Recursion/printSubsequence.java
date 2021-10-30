package Recursion;

public class printSubsequence {


    public static void subsequencePrint(String str, String soFar) {

        if (str.length() == 0) {
            System.out.println(soFar);
            return;
        }

        String smallInput = str.substring(1);
        subsequencePrint(smallInput, soFar);
        subsequencePrint(smallInput, soFar + str.charAt(0));

    }

    public static void main(String[] args) {

        subsequencePrint("abc","");
    }
}

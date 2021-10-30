package Recursion;

import java.util.Scanner;

public class Palindrome_String {

    public static boolean isStringPalindrome(String str){
        if(str.length()<=1) return true;
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return  isStringPalindrome(str.substring(1,str.length()-1));
        }else{
            return false;
        }
    }
    public static boolean checkPalindrome(String str, int si, int ei){
        if(si==ei) return true; //only one character
        //if first and last doesn't match return false
        if((str.charAt(si))!=str.charAt(ei)) return false;
        //if they are true check for middle characterS
        if(si<ei+1){
            return  checkPalindrome(str,si+1,ei-1);
        }
        return true;
    }
    public static boolean isStringPalindrome2(String str){
        if(str.length()==0) return true;
        return checkPalindrome(str,0,str.length()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();   //Input the string
        //Check whether palindrome or no
        if (isStringPalindrome2(str))
            System.out.println(str+" is palindrome");
        else
            System.out.println(str+ " is not a palindrome");

        if(isStringPalindrome(str)){
            System.out.println(str+" is palindrome");
        }
        else
            System.out.println(str+ " is not a palindrome");
    }
}

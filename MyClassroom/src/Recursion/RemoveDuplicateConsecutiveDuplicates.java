package Recursion;

public class RemoveDuplicateConsecutiveDuplicates {

    public static String removeDuplicate(String s){
        if(s.length()<=1)
            return s;
        if(s.charAt(0)==s.charAt(1))
            return removeDuplicate(s.substring(1));
        else {
            String smallOutput = removeDuplicate(s.substring(1));
            return  s.charAt(0)+smallOutput;
        }
    }
    public static void main(String[] args) {
        String str = "aabcddaea";
        str = removeDuplicate(str);
        System.out.println(str);
    }
}

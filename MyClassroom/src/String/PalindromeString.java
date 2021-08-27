package String;

public class PalindromeString {

    public static boolean isPalindrome(String str) {

        int n=str.length();
        int start=0;
        int end=n-1;

        while(start<end){
            if(str.charAt(start)!=str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}

package String;

public class ReverseString {

    public static String reverseString(String str){
        String reversedString ="";
        for(int i=str.length()-1;i>=0;i--){
            reversedString+=str.charAt(i);
        }
        return reversedString;
    }

    public static String reverseString2(String str){
        String reversedString ="";
        for(int i=0;i<str.length();i++){
            reversedString=str.charAt(i)+reversedString;
        }
        return reversedString;
    }
    public static void main(String[] args) {

        String str = "abcde";
        String reversedString = reverseString(str);
        String reversedString2 = reverseString2(str);
        System.out.println(reversedString);
        System.out.println(reversedString2);
    }
}

package String;

public class StringsDemo {

    public static void main(String[] args) {
        String str = "Coding";
        String str1 = ""; // Empty String
        System.out.println(str.length()); //Length of the string
        System.out.println(str.charAt(2)); //To access particular character
        System.out.println(str1.length());

        String st2 = " fun";
        String str3 = str.concat(st2);
        System.out.println(str+st2);
        System.out.println(str3);
        System.out.println(str1.equals(st2)); //Boolean T or F
        System.out.println(str1.compareTo(str3)); // if Same (0) or if not it compare with ASCII value
        //between the character
        System.out.println(str1.contains("ing"));
    }
}

package String;

public class SubString {
    public static void main(String[] args) {
        String s = "Rishon";
        String substr = s.substring(3);
        System.out.println(substr);
        System.out.println(substr.length());

        String sub = s.substring(1,4); // print from 1-3 character present
        System.out.println(sub);
    }
}

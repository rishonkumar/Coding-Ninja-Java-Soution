package String;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(str + " " + str.length());
        String str2 = s.next();
        System.out.println(str2 + " " + str2.length());

        String s3 = s.nextLine();
        System.out.println(s3 + " " + s3.length());
    }
}

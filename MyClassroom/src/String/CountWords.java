package String;

import java.util.Scanner;

public class CountWords {

    public static int countwords(String str){
        int n=str.length();
        if(n==0)
            return 0;

        int count=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' '){ // once u see a blank space increase the count.
                count++;
            }
        }
        return count+1;
    }
    public static void main(String[] args) {

       // String str = "One two";
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        System.out.println("No of words" + countwords(str1));
    }
}

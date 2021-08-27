package String;

public class ReverseWordWise {

    public static String reverseWordWise(String input){

        int i = input.length()-1;
        int end = input.length();
        String output = "";

        while(i>=0){
            if(input.charAt(i)==' '){
                output=output+input.substring(i+1,end) + " ";
                end = i;
            }
            i--;
        }
        output=output+input.substring(i+1,end); //for the last word
        return output;
    }
}

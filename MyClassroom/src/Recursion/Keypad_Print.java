package Recursion;

public class Keypad_Print {

    public static void keypad(int n,String output){

        if(n==0){
            System.out.println(output);
            return;
        }

        int lastDigit = n%10;
        int smallOuput = n/10;
        String optionLastDigit = getOptions(lastDigit);
        for(int i=0 ; i<optionLastDigit.length(); i++){
            keypad(smallOuput , optionLastDigit.charAt(i) + output);
        }
    }

    public static void printKeypad(int input){

        keypad(input,"");
    }

    public static String getOptions(int lastDigit) {

        if(lastDigit == 2){
            return "abc";
        }

        if(lastDigit == 3){
            return "def";
        }

        if(lastDigit == 4){
            return "ghi";
        }


        if(lastDigit == 5){
            return "jkl";
        }


        if(lastDigit == 6){
            return "mno";
        }

        if(lastDigit == 7){
            return "pqrs";
        }


        if(lastDigit == 8){
            return "tuv";
        }

        if(lastDigit == 9){
            return "wxyz";
        }

        return "";
    }
}

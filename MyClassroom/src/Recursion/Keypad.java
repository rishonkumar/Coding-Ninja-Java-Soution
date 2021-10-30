package Recursion;

public class Keypad {

    public static String[] keypad(int n){

        if(n==0){
            String[] output = new String[1];
            output[0] = "";
            return output;
        }

        String[] smallOutput = keypad(n/10);
        int lastDigit = n%10;
        String lastDigitOptions = getOptions(lastDigit);
        String[] output = new String[smallOutput.length * lastDigitOptions.length()];
        int k = 0;
        for(int i=0 ; i<smallOutput.length; i++){
            for(int j=0 ; j<lastDigitOptions.length();j++){
                output[k] = smallOutput[i] + lastDigitOptions.charAt(j);
                k++;
            }
        }
        return output;
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

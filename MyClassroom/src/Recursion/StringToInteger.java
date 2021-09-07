package Recursion;

public class StringToInteger {
    public static int convertStringToInt(String str){
        if(str.length()==0) return 0;
        int smallOutput = convertStringToInt(str.substring(0,str.length()-1));
        int lastDigit = str.charAt(str.length()-1)-'0';
        return smallOutput*10+lastDigit;
    }
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        String input = "12567";
        System.out.println(convertStringToInt(input));
    }

}

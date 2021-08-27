package String;

public class ReverseEachWord {

    public static String reverseEachWord(String str){

        String ans="";
        int currentWordStart=0;
        int i=0;
        for(;i<str.length();i++){
            if(str.charAt(i) == ' '){
                //Reverse Current Word
                int currentWordEnd = i-1;
                String reverseWord ="";
                for(int j=currentWordStart; j<=currentWordEnd;j++){
                    reverseWord=str.charAt(j)+reverseWord;
                }
                ans=ans+reverseWord + " ";
                currentWordStart=i+1;
            }
        }
        // to reverse last word coz there will be no space
        int currentWordEnd = i-1;
        String reverseWord ="";
        for(int j=currentWordStart; j<=currentWordEnd;j++){
            reverseWord=str.charAt(j)+reverseWord;
        }
        ans=ans+reverseWord;
        return ans;
    }

    public static void main(String[] args) {

        String str = "This is rishon kumar";
        System.out.println(reverseEachWord(str));
    }
}

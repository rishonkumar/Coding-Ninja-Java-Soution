package String;

public class ConsecutiveDuplicate {

    public static String removeConsecutiveDuplicates(String S) {

        int n=S.length();
        if(n==0)
            return S;

        int StartIndex=0;
        String res="";
        while(StartIndex<n){
            char UnqiueChar=S.charAt(StartIndex);//Store the String
            int NextCharIndex=StartIndex+1;

            while(NextCharIndex<n && S.charAt(NextCharIndex)==UnqiueChar){
                NextCharIndex=NextCharIndex+1; //Increment int index
            }
            res=res+UnqiueChar;
            StartIndex=NextCharIndex;
        }
        return res;
    }

    public static void main(String[] args) {
        String s1="aabccda";
        System.out.println(removeConsecutiveDuplicates(s1));
    }
}

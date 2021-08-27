package String;

public class CompressedString {

    public static String getCompressedString(String str){
        int n=str.length();
        String r="";
        if(n==0)
            return r;
        int currentCharcount=1;
        r=r+str.charAt(0);
        for(int i=1;i<n;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                currentCharcount++;
            }
            else{
                if(currentCharcount>1){
                    r=r+currentCharcount;
                    currentCharcount=1;
                }
                r=r+str.charAt(i);
            }
        }
        if(currentCharcount>1){
            r+=currentCharcount;
        }
        return r;
    }

    public static void main(String[] args) {
        String s1="aabccdaa";
        System.out.println(getCompressedString(s1));
    }
}

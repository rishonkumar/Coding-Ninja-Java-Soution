package String;

public class HighestOccuringCharacter {

    public static char highestOccuringChar(String str) {

        int[] count = new int[256];
        int len=str.length();
        int maxFrequency=0;
        //construct char array from input string
        for (int i=0;i<len;i++){
            count[str.charAt(i)]=count[str.charAt(i)]+1;
            maxFrequency=Math.max(maxFrequency,count[str.charAt(i)]);
        }
        char res=' ';

        for(int i=0;i<len;i++){
            if(count[str.charAt(i)]==maxFrequency){
                res=str.charAt(i);
            }
        }
        return res;
    }
}

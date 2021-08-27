package String;

import java.util.Arrays;

public class PermutationCheck {

    public static boolean isPermutation(String str1, String str2) {

        int n1=str1.length();
        int n2=str2.length();

        if(n1!=n2)
            return false;

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<n1;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean isPermutation2(String s1, String s2){
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2)
            return false;

        int frequency[] = new int[256];
        for(int i=0;i<frequency.length;i++){
            frequency[i]=0; // initiaize to zero all the elements
        }
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            frequency[ch]++;
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            frequency[ch]--;
        }
        for(int i=0;i<256;i++){
            if(frequency[i]!=0)
                return false;
        }
        return true;
    }


}

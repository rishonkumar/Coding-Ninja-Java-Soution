package LeetCode;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class nextGreatestLetter {

    public char NextgreaterLetter(char[] letters, char target){
        int n=letters.length;
        int start=0;
        int end=n-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<letters[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return letters[start %n];
        //Edge case: if their doesnt exits any
        // char greater then return the first char from the array
    }

}

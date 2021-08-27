package Lecure7;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rev = 0;
        int temp=n;
        while(temp>0){
            int l = temp%10;
            temp=temp/10;
            rev = rev * 10 + l;
        }
        System.out.println(rev);
    }
}

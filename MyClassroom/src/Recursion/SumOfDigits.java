package Recursion;

public class SumOfDigits {
    public static int SumofDigits(int n){
        if(n==0) return 0;
        return n%10 + SumofDigits(n/10);
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(SumofDigits(n));
    }
}

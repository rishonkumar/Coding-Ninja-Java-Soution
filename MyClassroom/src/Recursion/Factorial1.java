package Recursion;

public class Factorial1 {

    public static int facthelper(int n) {
        if (n == 0)
            return 1;

        return facthelper(n-1) * n;
    }

    public static void factorial(int n){
        int out = facthelper(n);
        System.out.println(out);
    }

    public static void factorial2(int input , int answer){
        if(input == 0){
            System.out.println(answer);
            return;
        }
        answer = answer*input;
        factorial2(input-1 , answer);

    }

    public static void main(String[] args) {
        int n = 5;
        factorial2(n,1);
    }
}

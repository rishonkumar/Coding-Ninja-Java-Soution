package Recursion;

public class NaturalNumbers {

    public static int sumn(int n) {
        if (n == 0)
            return 0; // Base Case
        int smallOuput = sumn(n - 1);
        int output = n + smallOuput;
        return output;
    }
    
    public static void main(String[] args) {
        System.out.println(sumn(10));
    }
}

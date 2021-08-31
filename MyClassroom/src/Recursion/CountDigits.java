package Recursion;

public class CountDigits {

    public static int Count(int n){
        if(n==0) return 0;
        int smallAns = Count(n/10);
        return smallAns+1;
    }

    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        //int n = scn.nextInt();
        System.out.println(Count(1234));
    }
}

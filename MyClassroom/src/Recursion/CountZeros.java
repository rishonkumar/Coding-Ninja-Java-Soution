package Recursion;

public class CountZeros {
    public static int countZeros(int num){
        if(num<10){
            if(num==0) return 1;
            else return 0;
        }
        if(num/10==0 && num%10==0) return 1;
        int smallOutput = countZeros(num/10);
        if(num%10==0)
            return smallOutput +1;
        else
            return smallOutput;
    }
}

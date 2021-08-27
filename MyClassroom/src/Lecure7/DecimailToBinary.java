package Lecure7;

import java.util.Scanner;

public class DecimailToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long rv = 0;
        long power =1;
        while(n>0){
            int digit = n%2;
            rv =rv+ digit*power;
            power=power*10;
            n=n/2;
        }
        System.out.println(rv);
    }
}

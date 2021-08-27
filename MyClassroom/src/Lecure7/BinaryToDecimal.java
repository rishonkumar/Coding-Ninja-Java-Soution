package Lecure7;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = n;
        int decimal=0;
        int power=1;
        while(num!=0){
            int lastdigit = num%10;
            decimal+= lastdigit*power;
            power*=2;
            num=num/10;
        }
        System.out.println(decimal);
    }
}

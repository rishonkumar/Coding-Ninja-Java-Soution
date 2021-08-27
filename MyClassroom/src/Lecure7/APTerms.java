package Lecure7;

import java.util.Scanner;

public class APTerms {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=1,x=1;

        while(count<=n){
            int t = 3*x+2;
            if(t%4!=0) {
                System.out.print(t+" ");
                count++;
            }
            x++;
        }
    }
}

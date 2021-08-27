package Lecure7;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int previous = s.nextInt();
        boolean isDec = true;
        boolean isValid = true;
        int i=1;
        while(i<n){
            int current = s.nextInt();

            if(current<previous){
                if(isDec = false)
                    isValid = false;
                    break;
            }
            else if(current==previous){
                isValid = false;
                break;
            }
            else if(current>previous){
                isDec=false;
            }
            previous = current;
            i++;
        }
        System.out.println(isValid);
    }
}

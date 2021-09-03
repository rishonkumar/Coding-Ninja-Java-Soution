package ConditionAndLoops;

import java.util.Scanner;

/*Given three values - Start Fahrenheit Value (S),
End Fahrenheit value (E) and Step Size (W),
you need to convert all Fahrenheit values from Start to End at the gap of W,
into their corresponding Celsius values and print the table.
I/P
0
100
20
o/p
0   -17
20  -6
40  4
60  15
80  26
100 37
 */
public class FahrenheitCelsius {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        int e = scn.nextInt();
        int w = scn.nextInt();

        int cfahrentValue = s;
        while(cfahrentValue <= e){
            int celsiusValue = (int)((5.0/9)*(cfahrentValue - 32));
            System.out.println(cfahrentValue + "\t" + celsiusValue);
            cfahrentValue = cfahrentValue + w;
        }

    }
}

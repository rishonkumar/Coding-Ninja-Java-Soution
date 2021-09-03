package ConditionAndLoops;

import java.util.Scanner;

public class totalSalary {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int basic = scn.nextInt();
        char grade = scn.next().charAt(0);

        double hra = 0.2 * basic;
        double da = 0.5 * basic;

        int allow;
        if(grade == 'A'){
            allow = 1700;
        }
        else if(grade == 'B'){
            allow = 1500;
        }
        else{
            allow = 1300;
        }
        double pf = 0.11 * basic;
        double totalSalary = basic + hra + da + allow - pf;

        int answer;
        System.out.println((int)Math.round(totalSalary));
    }
}

package TotalSalary;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter basic salary");
        double basic=sc.nextInt();
        //System.out.println("enter grade");
        char ch =sc.next().charAt(0);
        double hra=(basic*20)/100;
        //double hra=basic/5;
        double da=(basic*50)/100;
        int allow;
        if(ch=='A'){
            allow=1700;
        }
        else if (ch=='B'){
            allow=1500;
        }
        else {
            allow=1300;
        }
        double pf=(basic*11)/100;
        long totalSalary;
        totalSalary = Math.round(basic + hra + da + allow-pf);

        System.out.println(totalSalary);

    }
}

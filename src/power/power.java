package power;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of base");
        int base = sc.nextInt();
        System.out.println("enter value of power");

         int       powerRaised = sc.nextInt();
        int result = power(base, powerRaised);
        System.out.printf("%d^%d = %d", base, powerRaised, result);
    }
    public static int power(int base, int powerRaised) {
        if (powerRaised != 0)
            return (base * power(base, powerRaised - 1));
        else
            return 1;
    }
}

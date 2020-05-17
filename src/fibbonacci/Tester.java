package fibbonacci;

import java.util.Scanner;

public class Tester {

        static int n1 = 0, n2 = 1, n3 = 0;
        static void fibbonacci(int count) {
            if (count > 0) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(" " + n3);
                fibbonacci(count - 1);
            }
        }
        public static void main(String args[]) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter no:");
            int count =sc.nextInt();
            System.out.print(n1 + " " + n2);
            fibbonacci(count - 2);
        }

}

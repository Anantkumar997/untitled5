package DecimaltoBinary;

import java.util.Scanner;

public class Solution<sum> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long binary = 0,pow = 1;
        while (n>0){
            int lastbit= (int) (n%2);
            binary += lastbit*pow;
            pow*=10;
            n=n/2;
        }
        System.out.println(binary);
        //System.out.println(Integer.toBinaryString((int) n));
    }
}

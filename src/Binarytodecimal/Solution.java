package Binarytodecimal;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m;
        long sum=0;
        int len=String.valueOf(n).length();
        for (long i = 0; i < len; i++) {
            m=n%10;
            sum= (long) (sum+m*Math.pow(2,i));
            n=n/10;
        }
        System.out.println(sum);
    }
}

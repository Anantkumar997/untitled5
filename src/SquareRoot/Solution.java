package SquareRoot;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int s =(int) Math.sqrt(n);
        System.out.println(s);
    }
}

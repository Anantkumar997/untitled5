package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=1,n2=1,n3 = 0;
        System.out.println("enter no:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

            for (int i =0; i <num ; i++) {
                if (i > 1) {
                    n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                    //System.out.println(n3);
                }
                else{
                   // System.out.println(1);
                }
               // System.out.println(n3);
            }
        System.out.println(n3);
        


    }
}

package com.company;

import java.util.Scanner;

public class fiboexample {
    static int n1=1,n2=1,n3=0;
    static void fibo(int num){
        if(num>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            fibo(num-1);
            System.out.println(n3);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        fibo(num-2);
        System.out.println(n1+""+n2);
    }
}

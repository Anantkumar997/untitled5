package com.company;


import java.util.*;
class gla {

    int a=0;
    int f = 1;
    //System.out.println("enter a no.:");

    public void fac(int n) {

        for (int j = 1; j <= n; j++) {

            f = f * j;
        }
        System.out.println(f);


    }
    public void prime(int n){
        for (int i = 1; i <n; i++) {
            if(n%i==0){
                a=a+1;
            }

        }
        if(a<2){
            System.out.println("prime");
        }
        else
            System.out.println("non prime");
    }

    public static void main(String[] args) {
        System.out.println("enter a no:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        gla obj = new gla();
        obj.prime(n);
        obj.fac(n);
    }

}
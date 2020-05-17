package com.company;

import star.Stardemo;

import java.util.Scanner;

public class printfjava {
    public static void main(String[] args) {
        System.out.println("enter no of string");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println("enter string no :"+i);
            Scanner sc1 =new Scanner(System.in);
            String s = sc1.next();
            System.out.println(s);
            String s1=s.replaceAll("[^A-Za-z]","");
            String s2=s.replaceAll("[^0-9]","");
            System.out.printf("%s%15s %n",s1,s2);

        }

    }
}

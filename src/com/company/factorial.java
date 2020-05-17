package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class factorial {
    public static long fact(int num){

        if(num>=1){
            return num*fact(num-1);
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no.");
        int num=sc.nextInt();
        //int fact=1;
        long factorial= fact(num);
        //obj.fact(f);
        //for (int i = 1; i <=num ; i++) {
          //  fact=fact*i;


        System.out.println(factorial);
    }



}

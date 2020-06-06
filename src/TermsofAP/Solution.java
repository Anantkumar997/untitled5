package TermsofAP;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m;
        int a=0;
        for (int i = 1; i <= 1000; i++) {
            m=(3*i+2);
            if(m%4==0){
             continue;

            }else {
                a++;
                if(a<=n){
                    System.out.print(m+" ");
                }
            }

        }
    }
}

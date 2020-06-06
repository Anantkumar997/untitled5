package Reverseofanumber;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m=0;
        long a;
        long len;
        long s=0;
       // for (int i = 1; i < len; i++) {
            for (long j = 10; j < n*100; j*=10) {
               if(n%j==0){
                   continue;
               }else {
                   m=(n*10)/j;


                   break;
               }


            }
            //System.out.print(m);
            len=String.valueOf(m).length();
        //}
            for (int i = 0; i < len; i++) {
                a=m%10;
                s=s*10+a;
                //System.out.print(a);
                m=m/10;
            }
        System.out.println(s);
    }
}

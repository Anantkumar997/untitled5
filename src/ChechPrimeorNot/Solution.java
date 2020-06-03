package ChechPrimeorNot;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int i=2;
        while (i<n){
            if(n%i==0){
                a++;

            }
            i++;
        }
        if(a>0){
            System.out.println("Not prime");
        }else {
            System.out.println("prime");
        }
    }
}

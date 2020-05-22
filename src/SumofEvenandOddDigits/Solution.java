package SumofEvenandOddDigits;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int d;
        int oddsum=0;
        int evensum=0;
        while(N>0){
            d=N%10;
            N=N/10;
            if(d%2==0){
                evensum=evensum+d;
            }
            else {
                oddsum=oddsum+d;
            }
        }
        System.out.print(evensum+" ");
        System.out.println(oddsum);
    }
}

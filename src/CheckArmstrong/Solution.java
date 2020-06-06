package CheckArmstrong;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int len=String.valueOf(n).length();
        int rem,sum=0;
        for (int i = 0; i < len; i++) {
            rem=n%10;
            sum= (int) (sum+Math.pow(rem,len));
            n=n/10;

        }
        if(sum==temp){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

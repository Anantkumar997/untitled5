package PowerofAno;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int power;
        if (x==0 && n==0){
            System.out.println(1);
        }
        else {


            power=(int)Math.pow(x,n);
            System.out.println(power);
        }
    }
}

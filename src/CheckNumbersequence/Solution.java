package CheckNumbersequence;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int a=sc.nextInt();
        boolean isdec=true;
        int temp=0;
        for (int i = 0; i < n-1; i++) {
            int b=sc.nextInt();
            if(b==a){
                temp=0;
                isdec=false;
                break;
            }else if (b<a){
                temp=0;
                if (isdec==false){
                    isdec=false;
                    break;
                }else {
                    isdec = true;
                }
            }
            else {
                isdec=false;
                temp++;
            }
            a=b;
        }
        if(temp==0) {
            System.out.println(isdec);
        }else {
            System.out.println("true");
        }
    }
}

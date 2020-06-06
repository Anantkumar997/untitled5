package CheckNumbersequence;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev=sc.nextInt();
        boolean isdec=true;
        int count=2,current;
        while(count<=n){
            current=sc.nextInt();
            count++;
            if(current==prev){
                System.out.println("false");
                return;
            }
            if(current<prev){
                if(isdec==false){
                    System.out.println("false");
                    return;
                }
            }else {
                if(isdec==true){
                    isdec=false;
                }
            }
            prev=current;
        }
        System.out.println("true");
    }
}

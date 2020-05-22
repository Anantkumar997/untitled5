package pattern;

import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int i=1;
        while(i<=N){
            int k=i;
            while(k<=N-1){
                System.out.print(" ");
                k=k+1;
            }
            int j=1;
            int val=i;
            while(j<=i){
                System.out.print(val);
                val=val+1;
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}

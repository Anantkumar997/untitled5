package pattern;

import java.util.Scanner;

public class MirrorNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        //int temp=n;
        while(i<=n){
            int j=1;
            int temp=i;
            while(temp<n){
                System.out.print(" ");
                //j++;
                temp++;
            }
            int k=1;
            while(k<=i){
                System.out.print(k);
                k++;
            }
            System.out.println();
            i++;
        }
    }
}

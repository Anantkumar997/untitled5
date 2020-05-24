package pattern;

import java.util.Scanner;

public class InvertedNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int temp=n;
        while(i<=n){
            int j=1;

            while(j<=temp){
                System.out.print(temp);
                j++;

            }
            System.out.println();
            i++;
            temp--;
        }
    }
}

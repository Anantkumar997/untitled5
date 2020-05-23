package pattern;

import java.util.Scanner;

public class InterestingAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        //int temp=n;
        while(i<=n){
            int j=1;
            int temp2=i;
            while(j<=i){
                System.out.print((char)('A'+n-temp2));
                j++;
                temp2--;
            }
            System.out.println();
            i++;
        }
    }
}

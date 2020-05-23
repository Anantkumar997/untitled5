package pattern;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int temp=i;
            while(j<=i){
                System.out.print((char)('A'+temp-1));
                j++;
                temp++;
            }
            System.out.println();
            i++;
        }
    }
}

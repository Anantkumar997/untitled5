package pattern;

import java.util.Scanner;

public class NumberStarpattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            int j=n;
            while (j>0){
                if(j==i){
                    System.out.print("*");
                }else {
                    System.out.print(j);
                }
                j--;
            }
            System.out.println();
            
        }
    }
}

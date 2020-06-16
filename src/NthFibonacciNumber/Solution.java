package NthFibonacciNumber;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n3=0,n2=1;
        int n1=0;
        for (int i = 1; i <= n; i++) {
            if(i==1){
                n3=1;
                continue;
            }else {
                n3=n2+n1;
                n1=n2;
                n2=n3;
            }
        }
        System.out.println(n3);
    }
}

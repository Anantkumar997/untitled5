package factorial;

import java.util.Scanner;

public class fact {
    public static long factorial1(int n){
        if(n==0){
            return 1;
        }

        return n*factorial1(n-1);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no.");
        int n=sc.nextInt();
        long fact = factorial1(n);
        System.out.println(fact);


    }
}

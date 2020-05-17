package revstring;

import java.util.Scanner;

public class rev {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of element");
        int n =sc.nextInt();
        int ar[] =new int[n];
        int re[] =new int[n];
        for (int i = 0; i <n; i++) {
            ar[i]=sc.nextInt();

        }
        for (int i = 0; i <n; i++) {

            System.out.println(ar[i]+" ");

        }
        for (int i = 0; i <n; i++) {
            re[n-1-i]=ar[i];


        }
        for (int i = 0; i <n; i++) {
            //System.out.println("rev is...");
            System.out.println(re[i] + " ");
        }
    }
}

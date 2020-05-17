package star;

import java.util.Scanner;

public class Stardemo {
   // public Stardemo(){
        Scanner sc=new Scanner(System.in);
        //System.out.println("enter no of odd integer");
        int n=sc.nextInt();
        int m=(n+1)/2;
        int s=m;
        //System.out.println(m);


    //}
    void Starmain(){
        for (int i = 1; i <=n ; i++) {
            if(i<=m){
                for (int j = i; j <m; j++) {
                    System.out.print(" ");

                }
                //System.out.println("");
                for (int j =1; j <=i; j++) {
                    System.out.print("* ");

                }
                System.out.println("");
            }
            else{
                for (int j =m; j <i; j++) {
                    System.out.print(" ");

                }
                //System.out.println("");
                for (int j =s-1; j >=1; j--) {
                    System.out.print("* ");


                }
                System.out.println("");
                s=s-1;

            }

        }

    }

    public static void main(String[] args) {
        Stardemo obj=new Stardemo();
        obj.Starmain();

    }
}

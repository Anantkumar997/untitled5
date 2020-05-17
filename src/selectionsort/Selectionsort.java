package selectionsort;

import java.util.Scanner;

public class Selectionsort {
    void func(){

        Scanner sc = new Scanner(System.in);
        int ar[]=new int[5];

        System.out.println("enter element");
        for (int i = 0; i <5; i++) {
            ar[i]=sc.nextInt();

        }
        int temp;
        for (int r = 0; r <4 ; r++) {//no. of passes
            for (int c =r+1; c <5 ; c++) {

                if(ar[r]>ar[c]){
                    temp=ar[r];
                    ar[r]=ar[c];
                    ar[c]=temp;
                }
            }

        }
        System.out.println("-------------final list");
        for (int i = 0; i <5 ; i++) {

            System.out.println(ar[i]);
        }
    }
    public static void main(String[] args) {

        Selectionsort obj = new Selectionsort();
        obj.func();
    }
}

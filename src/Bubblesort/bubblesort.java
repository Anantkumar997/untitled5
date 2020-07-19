package Bubblesort;
import java.util.*;

public class bubblesort {
    void func(){
        Scanner sc =new Scanner(System.in);
        int ar[] = new int[5];
        for (int i = 0; i <5 ; i++) {

            ar[i]=sc.nextInt();
        }
        int temp;
        for (int r = 0; r <4 ; r++) {
            for (int c = 0; c <4 ; c++) {

                if(ar[c]>ar[c+1]){
                    temp=ar[c];
                    ar[c]=ar[c+1];
                    ar[c+1]=temp;
                }
            }

        }
        for (int i = 0; i <5 ; i++) {

            System.out.print(ar[i]+" ");
        }

    }

    public static void main(String[] args) {
        bubblesort obj = new bubblesort();
        obj.func();
    }
}

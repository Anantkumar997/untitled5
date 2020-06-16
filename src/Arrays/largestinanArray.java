package Arrays;

import java.util.Scanner;

public class largestinanArray {
    public static int[] takeinput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int inputarr[] = new int[n];
        for (int i = 0; i < n; i++) {
            inputarr[i]=sc.nextInt();
        }
        return inputarr;
    }
    public static int largest( int inputarr[]){
        int size = inputarr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if(inputarr[i]>max){
                max=inputarr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]=takeinput();
        int largest = largest(arr);
        System.out.println("largest "+largest);
    }
}

package Bubblesort;

import java.util.Scanner;

public class Solution {
    public int[] bubblesort(int arr[]){
        int temp=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                temp=arr[j];
                if(arr[j]>arr[j+1]){
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public void print(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements...");
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }
        Solution obj = new Solution();
        obj.bubblesort(arr);
        obj.print(arr);
    }
}

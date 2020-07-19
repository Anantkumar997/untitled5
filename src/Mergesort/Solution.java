package Mergesort;

import java.util.Scanner;

public class Solution {
    public static int[] mergesort(int arr[]){
        int arr1[] = new int[arr.length];
        
        print(arr1);
        return arr1;
    }
    public static int[] print(int arr1[]){
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }
        return arr1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of element");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements...");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        obj.mergesort(arr);
    }
}

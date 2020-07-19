package selectionsort;

import java.util.Scanner;

public class Solution {
    public int[] Selectionsort(int arr[]){
        int temp=0;
        for (int i = 0; i <arr.length ; i++) {
            //temp=arr[i];
            for (int j = i; j < arr.length; j++) {
                int temp2=0;
                if(arr[i]>arr[j]){
                    temp2=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp2;
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
        System.out.println("Enter no of element...");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        Solution obj = new Solution();
        obj.Selectionsort(arr);
        obj.print(arr);
    }
}

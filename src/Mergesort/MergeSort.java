package Mergesort;

import java.util.Scanner;

public class MergeSort {
    static void mergeSort(int input[],int start,int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(input,start,mid);
        mergeSort(input,mid+1,end);
        merge(input,start,end);
    }
    private static void merge(int input[],int start,int end){
        int mid = (start+end)/2;

        int ans[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end){
            if(input[i] < input[j]){
                ans[k] = input[i];
                i++;
                k++;
            }else{
                ans[k] = input[j];
                j++;
                k++;
            }
        }
        while (i <= mid){
            ans[k] = input[i];
            i++;
            k++;
        }
        while (j <= end){
            ans[k] = input[j];
            j++;
            k++;
        }
        for (int index = 0; index <ans.length ; index++) {
            input[start + index] = ans[index];
        }
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
        mergeSort(arr,0,arr.length-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}

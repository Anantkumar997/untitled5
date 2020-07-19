package InsertionSort;

import java.util.Scanner;

public class Solution {
    public int[] sortedarray(int[] arr, int n){
        int[] arr1 = new int[n];

        int temp =0;
        for(int i=1;i<n;i++){
            int start = arr[i];
            int j=i;
            while(start<arr[j-1] && j>0) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j]=start;
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //int[] arr = new int[n];
        int[] arr ={50,30,10,60,20};
        Solution obj = new Solution();
        obj.sortedarray( arr, n);
    }
}

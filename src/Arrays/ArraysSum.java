package Arrays;

import java.util.Scanner;

public class ArraysSum {
    public static int sum(int[] arr) {
        int sum=0;
        for (int i = 0; i <arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int[] takeinput(){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        return arr;
    }

    public static void main(String[] args) {
        int array[] =takeinput();
        int Sum=sum(array);
        System.out.println(Sum);
    }


}

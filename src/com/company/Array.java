package com.company;

import java.util.Scanner;

public class Array {
    java.util.Scanner sc1 = new java.util.Scanner(System.in);

    int s=sc1.nextInt();
    int ar[] = new int[s];

    void func2() {


        java.util.Scanner sc2 = new java.util.Scanner(System.in);
        System.out.println("...enter Array element..");
        for (int i = 0; i <s; i++) {
            ar[i] = sc2.nextInt();
        }
        System.out.println("...elements r..");
        for (int i = 0; i <=s-1; i++) {
            System.out.println(ar[i]);
        }
        //ar[0]=10;
        //ar[1]=20;
        //ar[2]=30;
        //ar[3]=40;
        //ar[4]=50;
    }
    void show(){

        System.out.println("...elements r..");
            for (int i = 0; i <=s-1; i++) {
                System.out.print(ar[i]+" ");
            }

    }
    void search() {
        java.util.Scanner sc3 = new java.util.Scanner(System.in);
        System.out.println("...enter Array element which do you want search..");
        int n = sc3.nextInt();
        int w;
        for (int i = 0; i <s; i++) {
            if (ar[i] == n) {
                System.out.println("index of search element is :" + i);

            }
            else{
                w=-1;
                //System.out.println("element not present in Array");

            }


        }

    }

    void insert () {
        java.util.Scanner sc4 = new java.util.Scanner(System.in);
        System.out.println("...enter Array index when do you want insert..");
        int n = sc4.nextInt();


        System.out.println("...enter Array element which do you want insert..");
        int v = sc4.nextInt();
        ar[n] = v;

        }
        void delete () {
            java.util.Scanner sc5 = new java.util.Scanner(System.in);
            System.out.println("...enter Array element which do you want to delete..");
            int n1 = sc5.nextInt();

            for (int i = 0; i <ar.length; i++) {
                if (ar[i] == n1) {
                    System.out.println("index of search element is :" + i);

                    int m= i;
                    for (int j = i; j <ar.length-1; j++) {
                        ar[j]=ar[j+1];

                    }
                    ar[ar.length-1]=0;

                }
                else {

                    continue;
                }


            }


        }


        void reverseArray(){
        int temp;
        int start=0;
        int end=ar.length;
        while(start<end){
            temp=ar[start];
            ar[start]=ar[end-1];
            ar[end-1]=temp;
            start++;
            end--;

        }
        }
    public static void main(String[]args){
            Array obj = new Array();
            obj.func2();
            obj.search();
            obj.show();
            //obj.insert();
            //obj.delete();

            obj.reverseArray();
            obj.show();
        }
    }

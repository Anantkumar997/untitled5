package com.company;

import java.util.Scanner;

class NODE{
    int data;
    NODE next;
}
public class stacklinked {

    NODE top;
    stacklinked(){

        top=null;
    }
    void push(){
        System.out.println("enter data");
        Scanner sc = new Scanner(System.in);
        int newitem=sc.nextInt();

        NODE newnode = new NODE();

        newnode.data=newitem;
        newnode.next=top;
        top=newnode;
        System.out.println("element inserted...");
    }
    void pop(){
        if(top==null){
            System.out.println("stack is empty..");
        }
        else{
            //top=top.next;
            System.out.println("element deleted.."+top.data);
            top=top.next;
        }

    }
    void traverse(){
        if(top==null){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("stack element....");
            NODE current;
            for (current = top; current !=null ; current=current.next) {
                System.out.println(current.data);
            }
        }

    }
    void peek(){
        if(top==null){
        System.out.println("stack is empty");
    }
    else{
        System.out.println("last element of stack   " + top.data);
    }


    }

    public static void main(String[] args) {
        stacklinked obj =new stacklinked();
        while(true){
            System.out.println("press 1 for push");
            System.out.println("press 2 for pop");
            System.out.println("press 3 for display");
            System.out.println("press 4 for peek");
            System.out.println("press 5 for exit");
            System.out.println("enter ur choice");
            Scanner choice = new Scanner(System.in);
            int ch=choice.nextInt();
            switch (ch){
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    obj.peek();
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice");


            }
        }
    }
}

package com.company;
import java.util.*;
class Node{
    int rollno;
    Node next;
    Node previous;
}

public class doublylinkedlist{
    Node START;
    doublylinkedlist(){
        START = null;

    }
    void addnode(){
        System.out.println("enter ur roll no");
        Scanner sc = new Scanner(System.in);
        int roll=sc.nextInt();

        Node newnode =new Node();
        newnode.rollno=roll;
        newnode.next=null;
        if(START==null){
            START=newnode;
        }
        else{
            Node currentnode=START;
            while (currentnode.next!=null){
                currentnode=currentnode.next;
                newnode.previous=currentnode;


            }
            currentnode.next=newnode;
        }
        System.out.println("element inserted");
        //System.out.println("add");
    }
    void search(){
        if(START==null){
            System.out.println("list is empty");

        }
        else {
            System.out.println("enter searching element");
            Scanner sc=new Scanner(System.in);
            int ser=sc.nextInt();
            Node current;
            int c=0;
            for (current = START;current!=null ;current=current.next) {
                if(current.rollno==ser){
                    c++;
                    break;
                }

            }
            if(c>0){
                System.out.println("found");
            }
            else{
                System.out.println("not found");
            }

        }
        //System.out.println("search");

    }
    void delete(){
        System.out.println("delete");

    }
    void traverseforword(){
        if(START==null){
            System.out.println("list is empty");

        }
        else{
            Node current;
            for (current = START; current !=null ; current=current.next) {
                System.out.println("elements r:"+current.rollno);

            }

        }
        //System.out.println("display");

    }
    void traversereverse(){
        if(START==null){
            System.out.println("list is empty");

        }
        else{

            }


        //System.out.println("display");

    }


    public static void main(String[] args) {
        doublylinkedlist obj =new doublylinkedlist();
        while(true) {
            System.out.println("1.add");
            System.out.println("2.delete");
            System.out.println("3.search");
            System.out.println("4.traverse forword");
            System.out.println("5.traverse reverse");
            System.out.println("6.exit");
            System.out.println("enter ur choices");

            Scanner choice = new Scanner(System.in);
            int ch = choice.nextInt();

            switch (ch) {
                case 1:
                    obj.addnode();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.search();
                    break;
                case 4:
                    obj.traverseforword();
                    break;
                case 5:
                    obj.traversereverse();
                    break;

                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }

    }
}

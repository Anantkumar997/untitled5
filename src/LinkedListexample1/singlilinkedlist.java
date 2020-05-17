package LinkedListexample1;
import LinkedList.SingliLinkedListdemo;

import java.util.Scanner;

class Node{
    int data;
    Node next;
}

public class singlilinkedlist {
    Node start;
    singlilinkedlist(){
       start =null;

    }
    void addnode(){
        System.out.println("enter data");
        Scanner sc = new Scanner(System.in);
        int tempdata=sc.nextInt();

        Node tempnode =new Node();
        tempnode.data=tempdata;
        tempnode.next=null;

        if(start==null){
            start=tempnode;

        }
        else{
            Node currentnode=start;
            while (currentnode.next!=null){
                currentnode=currentnode.next;
                //System.out.println("data inserted");
            }
            currentnode.next=tempnode;
        }
        System.out.println("data inserted..");
    }
    void search(){
        if(start==null){
            System.out.println("list is empty");
        }
        else{
            System.out.println("enter serching data...");
            Scanner sc =new Scanner(System.in);
            int ser=sc.nextInt();

            Node currentnode;
            int c=0;
            for (currentnode = start;currentnode !=null ;currentnode=currentnode.next) {
                if(currentnode.data==ser){
                    c++;
                    break;
                }

            }
            if(c>0){
                System.out.println("data faund..."+currentnode.next);

            }
            else {
                System.out.println("data not faund..");

            }

        }


    }
    void traverse(){
        if(start==null){
            System.out.println("list is empty..");
        }
        else{
            Node currenode=start;

            while (currenode!=null){
                //currenode=currenode.next;
                System.out.println("data :"+currenode.data+currenode.next);
                currenode=currenode.next;
            /*Node current;
            for (current = start; current !=null ; current=current.next) {
                System.out.println("elements r:"+current.data);*/
            }

        }

    }
    void delete(){
        if(start==null){
            System.out.println("list is empty");
        }
        else{
            System.out.println("enter deleting data...");
            Scanner sc =new Scanner(System.in);
            int ser=sc.nextInt();

            Node currentnode;
            int c=0;
            for (currentnode = start;currentnode.next !=null ;currentnode=currentnode.next) {
                if(currentnode.next.data==ser){
                    c++;
                    break;
                }

            }
            if(c>0){

                currentnode.next=currentnode.next.next;
                System.out.println("data deleted...");

            }
            else {
                System.out.println("data not faund..");

            }

        }

    }
    public static void main(String[] args) {
        singlilinkedlist obj =new singlilinkedlist();
        while(true) {
            System.out.println("1.add");
            System.out.println("2.delete");
            System.out.println("3.search");
            System.out.println("4.traverse");
            System.out.println("5.exit");
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
                    obj.traverse();
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

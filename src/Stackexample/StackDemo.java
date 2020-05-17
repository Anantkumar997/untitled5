package Stackexample;
import java.util.Scanner;
public class StackDemo {
    int ar[];
    int top;
    StackDemo(){
        ar= new int[5];
        top=-1;


    }
    void push(){

        //System.out.println("insert values");
        if(top==4){
            System.out.println("stack is full // overflow");

        }
        else{
            System.out.println("enter element");
            Scanner sc = new Scanner(System.in);
            int newitem=sc.nextInt();

            top=top+1;
            ar[top]=newitem;
            System.out.println("element inserted");

        }
    }
    void pop(){
        if(top==-1){
            System.out.println("stack is empty");


        }
        else{
            System.out.println("element deleted "+ar[top]);
            top=top-1;


        }
        //System.out.println("pop is working");
    }
    void traverse(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            for (int i = top; i >=0; i--) {
                System.out.println(ar[i]);

            }
        }
        //System.out.println("display fn is working");
    }
    void peek(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("last element of stack"+ ar[top]);
        }
    }

    public static void main(String[] args) {
        StackDemo obj =new StackDemo();
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

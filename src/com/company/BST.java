package com.company;
import java.util.*;
class NODe{
    int data;
    NODe left;
    NODe right;
}

public class BST {
    NODe root;
    BST(){
        root=null;
    }
    void insert(){
        System.out.println("enter any data");
        Scanner sc2 =new Scanner(System.in);
        int item =sc2.nextInt();

        NODe newnode = new NODe();
        newnode.data=item;
        newnode.left=null;
        newnode.right=null;

        if(root==null){
            root=newnode;

        }
        else if (item<root.data){

        }
        else if (item>root.data){

        }
        System.out.println("element inserted...");

    }
    void inorder(NODe root){
        if(root==null){
            System.out.println("tree empty");

        }
        else{
            inorder(root.left);
            System.out.println(" "+root.data);
            inorder(root.right);
        }

    }
    void preorder(NODe root){
        if(root==null){
            System.out.println("tree empty");

        }
        else{

            System.out.println(" "+root.data);
            preorder(root.right);
        }

    }
    void postorder(NODe root){
        if(root==null){
            System.out.println("tree empty");

        }
        else{
            postorder(root.left);
            postorder(root.right);
            System.out.println(" "+root.data);

        }

    }

    public static void main(String[] args) {
        BST obj = new BST();
        System.out.println("1 for insert");
        System.out.println("2 for inorder");
        System.out.println("3 for preorder");
        System.out.println("4 for postorder");
        System.out.println("enter choise");
        Scanner sc= new Scanner(System.in);
        int ch =sc.nextInt();
        switch(ch){
            case 1:
                obj.insert();
                break;
            case 2:
                obj.inorder(obj.root);
                break;
            case 3:
                obj.preorder(obj.root);
                break;
            case 4:
                obj.postorder(obj.root);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("wrong choise");
        }
    }
}

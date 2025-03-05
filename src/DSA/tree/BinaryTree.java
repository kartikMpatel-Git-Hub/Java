package DSA.tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }
    private class Node{
        int data;
        Node left;
        Node right;

        public Node() {

        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;

//    Insert Elements
    public  void populate(Scanner s){
        System.out.println("Enter The Value For Node :");
        int val = s.nextInt();
        root = new Node(val);
        populate(s,root);
    }

    private void populate(Scanner s,Node root){
        System.out.println("Do you want to Enter Left of "+root.data);
        boolean left = s.nextBoolean();
        if(left){
            System.out.println("Enter The Value For Left Of "+root.data);
            int val = s.nextInt();
            root.left = new Node(val);
            populate(s,root.left);
        }
        System.out.println("Do you want to Enter Right of "+root.data);
        boolean right = s.nextBoolean();
        if(right) {
            System.out.println("Enter The Value For Right Of "+root.data);
            int val = s.nextInt();
            root.right = new Node(val);
            populate(s,root.right);
        }
    }

    public void display(){
        display(root," ");
    }

    private void display(Node root,String indentation){
        if(root == null){
            return;
        }
        System.out.println(indentation + root.data);
        display(root.left, indentation + "\t");
        display(root.right, indentation + "\t");
    }

    public void displayFormate(){
        displayFormate(root,0);
    }

    private void displayFormate(Node root,int level){
        if(root  == null){
            return;
        }
        displayFormate(root.right,level+1);

        if(level != 0){
            for(int i = 0; i < level - 1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->" + root.data);
        }
        else{
            System.out.println(root.data);
        }

        displayFormate(root.left,level+1);
    }
}

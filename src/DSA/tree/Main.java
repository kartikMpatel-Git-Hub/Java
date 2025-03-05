package DSA.tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(s);
////        tree.display();
//        tree.displayFormate();

//        BST tree = new BST();
//        int nums[] = {1,2,3,4,5,6,7,8,9,10};
//        tree.populatedSort(nums);
//        tree.displayFormate();
//        System.out.println("\nPre Order : ");
//        tree.preOrder();
//        System.out.println("\nPost Order : ");
//        tree.postOrder();
//        System.out.println("\nIn Order : ");
//        tree.inOrder();


        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        SegmentTree tree = new SegmentTree(nums);
        tree.display();
    }
}

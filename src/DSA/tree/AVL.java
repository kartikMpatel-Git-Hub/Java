package DSA.tree;

public class AVL extends BST{
    public static void main(String[] args) {

        BST tree = new BST();
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int i : arr) {
            tree.insertAVL(i);
        }
        tree.displayFormate();
    }
}
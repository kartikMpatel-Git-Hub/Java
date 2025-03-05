package DSA.tree;

public class BST {
    public class Node {
        private int data;
        private int level;
        private Node left;
        private Node right;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node(int data) {
            this.data = data;
            this.level = 1;
        }
    }

    private Node root;

    public BST() {
    }

    public BST(Node root) {
        this.root = root;
    }

    public int height(Node root) {
        if (root == null)
            return 0;
        return root.level;
    }

    public int height() {
        return height(root);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insertAVL(nums[i]);
        }
    }

    public void populatedSort(int[] nums) {
        populatedSort(nums, 0, nums.length);
    }

    private void populatedSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        this.insert(nums[mid]);
        populatedSort(nums, start, mid);
        populatedSort(nums, mid + 1, end);
    }

    public void insert(int data) {
        root = insert(data, root);
    }

    public void insertAVL(int data) {
        root = insertAVL(data, root);
    }

    private Node insert(int data, Node root) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(data, root.left);
        } else if (data > root.data) {
            root.right = insert(data, root.right);
        }
        root.level = Math.max(height(root.left), height(root.right)) + 1;
        return root;
    }

    private Node insertAVL(int data,Node root){
        if(root == null){
            return new Node(data);
        }
        if(data < root.data){
            root.left = insertAVL(data,root.left);
        }
        else if(data > root.data){
            root.right = insertAVL(data,root.right);
        }
        root.level = Math.max(height(root.left),height(root.right)) + 1;
        return rotate(root);
    }
    private Node rotateRight(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.level = Math.max(height(p.left),height(p.right)) + 1;
        c.level = Math.max(height(c.left),height(c.right)) + 1;

        return c;
    }

    private Node rotateLeft(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        c.level = Math.max(height(c.left),height(c.right)) + 1;
        p.level = Math.max(height(p.left),height(p.right)) + 1;

        return p;
    }
    private Node rotate(Node root){
        int diff = height(root.left) - height(root.right);
        if(diff > 1){
            /// Left Is Heavy
            if(height(root.left.left) >= height(root.left.right)){
                return rotateRight(root);
            }
            else{
                root.left = rotateLeft(root.left);
                return rotateRight(root);
            }
        }
        if(diff < -1){
            /// Right Is Heavy
            if(height(root.right.left) <= height(root.right.right)){
                return rotateLeft(root);
            }
            else{
                root.right = rotateRight(root.right);
                return rotateLeft(root);
            }
        }

        return root;
    }










































//    private Node insertAVL(int data, Node root) {
//        if (root == null) {
//            return new Node(data);
//        }
//        if (data < root.data) {
//            root.left = insertAVL(data, root.left);
//        } else if (data > root.data) {
//            root.right = insertAVL(data, root.right);
//        }
//        root.level = Math.max(height(root.left), height(root.right)) + 1;
//        return rotate(root);
//    }
//
//    private Node rightRotate(Node p) {
//        Node c = p.left;
//        Node t = c.right;
//
//        c.right = p;
//        p.left = t;
//
//        p.level = Math.max(height(p.left), height(p.right)) + 1;
//        c.level = Math.max(height(c.left), height(c.right)) + 1;
//        return c;
//    }
//
//    private Node leftRotate(Node c) {
//        Node p = c.right;
//        Node t = p.left;
//
//        p.left = c;
//        c.right = t;
//
//        c.level = Math.max(height(c.left), height(c.right)) + 1;
//        p.level = Math.max(height(p.left), height(p.right)) + 1;
//        return p;
//    }
//
//    private Node rotate(Node root) {
//        int balance = height(root.left) - height(root.right);
//
//        if (balance > 1) { // Left Heavy
//            if (height(root.left.left) >= height(root.left.right)) {
//                return rightRotate(root); // LL Case
//            } else {
//                root.left = leftRotate(root.left);
//                return rightRotate(root); // LR Case
//            }
//        }
//
//        if (balance < -1) { // Right Heavy
//            if (height(root.right.right) >= height(root.right.left)) {
//                return leftRotate(root); // RR Case
//            } else {
//                root.right = rightRotate(root.right);
//                return leftRotate(root); // RL Case
//            }
//        }
//
//        return root;
//    }

    public void display() {
        display(root, "Root Node :");
    }

    private void display(Node root, String str) {
        if (root == null)
            return;
        System.out.println(str + root.getData());
        display(root.left, "Left Child of " + root.getData() + " : ");
        display(root.right, "Right Child of " + root.getData() + " : ");
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public void displayFormate() {
        displayFormate(root, 0);
    }

    public void preOrder() {
        preOrder(root);
    }

    public void postOrder() {
        postOrder(root);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + "\t");
        preOrder(root.left);
        preOrder(root.right);
    }

    private void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "\t");
    }

    private void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + "\t");
        inOrder(root.right);
    }

    private void displayFormate(Node root, int level) {
        if (root == null) {
            return;
        }
        displayFormate(root.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->" + root.data);
        } else {
            System.out.println(root.data);
        }

        displayFormate(root.left, level + 1);
    }
}
/*
package DSA.tree;
public class BST {
    public class Node{
        private int data;
        private int level;
        private Node left;
        private Node right;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public BST() {
    }

    public BST(Node root) {
        this.root = root;
    }

    public int height(Node root){
        if(root == null)
            return -1;
        return root.level;
    }
    public int height(){
        return root.level;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void populate(int[] nums){
        for(int i = 0; i < nums.length; i++){
            this.insertAVL(nums[i]);
        }
    }

    public void populatedSort(int[] nums){
        populatedSort(nums,0,nums.length);
    }


    private void populatedSort(int[] nums,int start,int end){
        if(start >= end){
            return;
        }

        int mid = start + (end - start)/2;
        this.insert(nums[mid]);
        populatedSort(nums,start,mid);
        populatedSort(nums,mid+1,end);
    }

    public void insert(int data){
        root = insert(data,root);
    }
    public void insertAVL(int data){
        root = insertAVL(data,root);
    }

    private Node insert(int data,Node root){

        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = insert(data,root.left);
        }
        if(data > root.data){
            root.right = insert(data,root.right);
        }
        root.level = Math.max(height(root.left),height(root.right)) + 1;
        return root;
    }

    private Node insertAVL(int data,Node root){

        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = insert(data,root.left);
        }
        if(data > root.data){
            root.right = insert(data,root.right);
        }
        root.level = Math.max(height(root.left),height(root.right)) + 1;
        return rotate(root);
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.level = Math.max(height(p.left),height(p.right) + 1);
        c.level = Math.max(height(c.left),height(c.right) + 1);
        return c;
    }
    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;
//        c.right = p;
//        p.left = t;

        p.level = Math.max(height(p.left),height(p.right) + 1);
        c.level = Math.max(height(c.left),height(c.right) + 1);
        return p;
    }
    private Node rotate(Node root){
        if(height(root.left) - height(root.right) > 1){
            /// Left Is Heavy
            if(height(root.left.left) - height(root.left.right) > 0){
                /// Left Left Side Is Heavy
                return rightRotate(root);
            }
//            if(height(root.left.left) - height(root.left.right) < 0){
            else{
                /// Left Right Side Is Heavy
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
        }

        if(height(root.left) - height(root.right) < -1){
            /// Right Is Heavy
            if(height(root.right.left) - height(root.right.right) < 0){
                /// right Left Side Is Heavy
                return leftRotate(root);
            }
//            if(height(root.right.left) - height(root.right.right) > 0){
                /// right Right Side Is Heavy
            else{
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
        }
        return root;
    }
    public void display(){
        display(root,"Root Node :");
    }

    private void display(Node root,String str){
        if(root == null)
            return;
        System.out.println(str + root.getData());
        display(root.left,"Left Child of "+root.getData()+" : ");
        display(root.right,"right Child of "+root.getData()+" : ");
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(Node root){
        if(root == null){
            return true;
        }

        return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public void displayFormate(){
        displayFormate(root,0);
    }
    public void preOrder(){
        preOrder(root);
    }
    public void postOrder(){
        postOrder(root);
    }
    public void inOrder(){
        inOrder(root);
    }

    private void preOrder(Node root){
        if(root == null)
            return;
        System.out.print(root.data + "\t");
        preOrder(root.left);
        preOrder(root.right);
    }
    private void postOrder(Node root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "\t");
    }
    private void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + "\t");
        inOrder(root.right);
    }
    private void displayFormate(Node root, int level){
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
}*/
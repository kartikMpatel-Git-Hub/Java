package DSA.tree;

public class SegmentTree {
    class Node{

        int data;
        Node left;
        Node right;
        int start;
        int end;
        public Node(int start,int end){
            this.start = start;
            this.end = end;
        }

    }
    Node root;

    public SegmentTree(int[] arr){
        root = construct(arr,0,arr.length-1);
    }

    private Node construct(int []arr,int start,int end){
        if(start == end){
            Node node = new Node(start,end);
            node.data = arr[start];
            return node;
        }

        int mid = start + (end - start) / 2;
        Node node = new Node(start,end);
        node.left = construct(arr,start,mid);
        node.right = construct(arr,mid+1,end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
       display(this.root);
    }

    private void display(Node root){
        if(root.left != null){
            System.out.print(root.left.data + " => ");
        }
        else {
            System.out.print("END => ");
        }
        System.out.print(root.data);
        if(root.right != null){
            System.out.print(" <= " + root.right.data);
        }
        else {
            System.out.print(" <= END");
        }
        System.out.println();
        if(root.left != null){
            display(root.left);
        }
        if(root.right != null){
            display(root.right);
        }
    }

    public void update(int index,int value){
        this.root.data = update(this.root,index,value);
    }

    private int update(Node root,int idx,int val){
        if(idx >= root.start && idx <= root.end){
            if(root.start == root.end){
                root.data = val;
                return root.data;
            }
            update(root.left,idx,val);
            update(root.right,idx,val);
            root.data = root.left.data + root.right.data;
            return root.data;
        }
        return root.data;
    }

    public int query(int start,int end){
        return query(this.root,start,end);
    }

    private int query(Node root,int start,int end){
        if(root.start >= start && root.end <= end){
            return root.data;
        }
        if(root.start > end || root.end < start){
            return 0;
        }
        return query(root.left,start,end) + query(root.right,start,end);
    }
}

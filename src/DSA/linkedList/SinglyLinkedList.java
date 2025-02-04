package DSA.linkedList;

public class SinglyLinkedList {

    class Node{
        private int data;
        private Node next;


        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head = null;
    private Node tail = null;

    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        while (temp.next != tail){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    public void insertIndex(int data,int idx){
        if(size < idx){
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        for(int i = 0; i < idx-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    public Node getNode(int idx){
        if(idx >= size || idx < 0){
            return null;
        }
        Node temp = head;
        for(int i = 0; i < idx; i++){
            temp = temp.next;
        }
        return temp;
    }
    public void deleteIndex(int idx){
        Node temp = head;
        if(size <= idx){
            System.out.println("\n\nIndex Out Of Bound !");
            return;
        }
        for(int i = 0; i < idx - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public boolean isContains(int data){
        Node temp = head;
        while (temp != null){
            if(temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void display(){
        Node temp = head;
        System.out.println();
        System.out.print("[");
        while (temp != null){
            System.out.print(temp.data );
            if(temp.next != null){
                System.out.print(",");
            }
            temp = temp.next;
        }
        System.out.print("]");
    }

    private int size = 0;
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
//        ll.insertNode(1);
//        ll.insertNode(2);
//        ll.insertNode(3);
//        ll.insertNode(4);
//        ll.insertNode(5);
//        System.out.println(ll.isContains(1));
//        ll.display();
        ll.deleteFirst();
//        ll.display();
//        ll.deleteLast();
//        ll.display();
//        ll.deleteIndex(3);
        ll.display();
//        System.out.println(ll.getNode(2).data);
    }
}

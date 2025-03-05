package DSA.linkedList;

public class MergeTwoLinkedList {
    class Node{
        public int data;
        public Node next;


        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    Node head;
    Node tail;
    MergeTwoLinkedList(){
        head = null;
        tail = null;
    }
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
    public static void display(Node head){
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
    public static Node mergerSort(Node list1,Node list2){
        MergeTwoLinkedList temp = new MergeTwoLinkedList();
        while (list1 != null && list2 != null){
            if(list1.data < list2.data){
                temp.insertNode(list1.data);
                list1 = list1.next;
            }
            else{
                temp.insertNode(list2.data);
                list2 = list2.next;
            }
        }
        while (list1 != null){
            temp.insertNode(list1.data);
            list1 = list1.next;
        }
        while (list2 != null){
            temp.insertNode(list2.data);
            list2 = list2.next;
        }
        return temp.head;
    }

    public static Node midNode(Node head){
        Node slowNode = head;
        Node fastNode = head;
        while (fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        return slowNode;
    }
    private int size = 0;
    public static void main(String[] args) {
        MergeTwoLinkedList ll1 = new MergeTwoLinkedList();
        MergeTwoLinkedList ll2 = new MergeTwoLinkedList();
        ll1.insertNode(1);
        ll1.insertNode(3);
        ll1.insertNode(5);
        ll2.insertNode(2);
        ll2.insertNode(4);
        ll2.insertNode(5);
        ll1.display();
        ll2.display();

        MergeTwoLinkedList sorted = new MergeTwoLinkedList();
        sorted.head= mergerSort(ll1.head, ll2.head);
        sorted.display();
        Node midNode = midNode(sorted.head);
        display(midNode);
    }
}

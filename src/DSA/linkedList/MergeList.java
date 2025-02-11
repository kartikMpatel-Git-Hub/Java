package DSA.linkedList;

public class MergeList extends SinglyLinkedList{

    public static SinglyLinkedList merge(SinglyLinkedList first,SinglyLinkedList second){
        Node f = first.head;
        Node s = second.head;

        SinglyLinkedList newLL = new SinglyLinkedList();
        while (f != null && s != null){
            if(f.data < s.data){
                newLL.insertNode(f.data);
                f = f.next;
            }
            else{
                newLL.insertNode(s.data);
                s = s.next;
            }
        }
        while (f != null){
            newLL.insertNode(f.data);
            f = f.next;
        }
        while (s != null){
            newLL.insertNode(s.data);
            s = s.next;
        }

        return newLL;
    }

    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();

        list1.insertNode(1);
        list1.insertNode(2);
        list1.insertNode(9);

        list2.insertNode(0);
        list2.insertNode(3);
        list2.insertNode(5);

        SinglyLinkedList list3 = merge(list1,list2);
        list3.display();
    }
}

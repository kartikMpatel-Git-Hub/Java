package DSA.linkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


}
public class SortList {

    public static ListNode merge(ListNode first,ListNode second){
        ListNode tempHead = new ListNode();
        ListNode temp = tempHead;
        while(first != null && second != null){
            if(first.val < second.val){
                temp.next = first;
                first = first.next;
                temp = temp.next;
            }
            else{
                temp.next = second;
                second = second.next;
                temp = temp.next;
            }
        }
        temp.next = (first != null) ? first : second;
        return tempHead.next;
    }
    public static ListNode mid(ListNode head){
        ListNode midPre = null;
        while(head != null && head.next != null){
            midPre = (midPre == null) ? head : midPre.next;
            head = head.next.next;
        }
        ListNode mid = midPre.next;
        midPre.next = null;
        return mid;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode mid = mid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left,right);
    }
    public void insertNode(int data){
    }
    public static void main(String[] args) {
        ListNode ll = new ListNode();

    }
}

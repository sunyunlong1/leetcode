import java.util.ArrayList;
import java.util.List;

public class a18 {
    public static ListNode deleteNode(ListNode head, int val) {
        ListNode prev = head;
        while(prev != null){
            if(prev.val == val){
                prev = prev.next;
                break;
            }
            if(prev.next.val == val){
                prev.next = prev.next.next;
                break;
            }
            prev = prev.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(-3);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(-99);
        ListNode l4 = new ListNode(9);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
//        ListNode listNode=deleteNode(l1, -3);
//        while(listNode != null){
//            System.out.println(listNode.val);
//            listNode = listNode.next;
//        }
        ListNode prev = l1;

        prev = prev.next;

        prev.next = prev.next.next;

        System.out.println(l1.next);
        
        List<String> list = new ArrayList<>();
        Object[] objects=list.toArray();
    }
}

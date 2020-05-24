
import java.util.ArrayList;
import java.util.List;

public class a876 {
    public static ListNode middleNode(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode prev = head;
        while(prev != null){
            list.add(prev.val);
            prev = prev.next;
        }
        int index = 0;
        while(index < list.size() / 2){
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode listNode=middleNode(l1);
        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}

import java.util.HashMap;
import java.util.Map;

public class add0 {
    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode l1 = new ListNode(0);
        l1.next = head;
        int sum = 0;
        Map<Integer,ListNode> map = new HashMap<>();
        while(l1 != null){
            sum += l1.val;
            map.put(sum,l1);
            l1 = l1.next;
        }
        sum = 0;
        ListNode l2 = new ListNode(0);
        l2.next = head;
        ListNode l3 = l2;
        while(l3 != null){
            sum += l3.val;
            l3.next = map.get(sum).next;
            l3 = l3.next;
        }
        return l2.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(-3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode listNode=removeZeroSumSublists(l1);
        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

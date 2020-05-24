import java.util.HashMap;
import java.util.Map;

public class huanxinglianbiao {
    public static ListNode detectCycle(ListNode head) {
        Map<ListNode,Integer> map = new HashMap<>();
        int length = 0;
        ListNode l1 = head;
        while(true){
            if(map.get(l1) != null){
                break;
            }
            map.put(l1,length);
            length++;
            l1 = l1.next;
        }
        ListNode l2 = head;
        ListNode l3 = head;
        while(l2 != l3){
            l2 = l2.next;
            l3 = l3.next.next;
        }
        Integer index = map.get(l2);
        int i = 0;
        while(i< length - index){
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l2;
        ListNode listNode = detectCycle(l1);
    }
}

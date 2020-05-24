import java.util.HashMap;
import java.util.Map;

public class a83 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode l1 = new ListNode(-1);
        ListNode prev = l1;
        Map<Integer,Integer> map = new HashMap<>();
        while(head != null){
            Integer value = map.get(head.val);
            if(value == null){
                prev.next = head;
                prev = prev.next;
            }
            map.put(head.val,head.val);
            head = head.next;
        }
        Integer value = map.get(prev.val);
        if(value != null){
            prev.next = null;
        }
        return l1.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode listNode=deleteDuplicates(l1);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }


    }
}


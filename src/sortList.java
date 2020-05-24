public class sortList {

    public static ListNode sortList(ListNode head) {
        return sort(head);
    }

    public static ListNode sort(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        ListNode l1 = sort(head2);
        ListNode l2 = sort(head);
        return merge(l1,l2);
    }

    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode l3 = new ListNode(-1);
        ListNode l4 = l3;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                l3.next = l1;
                l1 = l1.next;
            }else{
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if(l1 != null) l3.next = l1;
        if(l2 != null) l3.next = l2;
        return l4.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode listNode=sortList(l1);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
//        ListNode ll1 = l1.next;
//        ListNode ll2 = l1;
//        l1.next = null;
//        l1 = ll1;
//        System.out.println("1");

    }
}

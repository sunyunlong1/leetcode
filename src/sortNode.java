public class sortNode {
    public static ListNode insertionSortList(ListNode head) {
        ListNode l1 = new ListNode(-1);
        ListNode l2 = l1;
        int index = 0;
        while(head != null){
            //l3是后半部分
            ListNode l3 = head.next;
            //l4是第一个
            ListNode l4 = head;
            head.next = null;
            head = l3;
            if(l2.next == null){
                l2.next = l4;
            }
            ListNode l5 = l1;
            while(l5.next != null) {
                if (l5.next.val >= l4.val) {
                    ListNode l6=l5.next;
                    l4.next=l6;
                    l5.next=l4;
                    break;
                }
                l5=l5.next;
            }
            l2 = l2.next;
        }
        return l1.next;
}

    public static void main(String[] args) {
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(0);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode listNode=insertionSortList(l1);
        System.out.println("!");
    }
}

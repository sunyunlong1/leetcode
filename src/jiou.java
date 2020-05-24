public class jiou {
    public static ListNode oddEvenList(ListNode head) {
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        ListNode l3 = l1;
        ListNode l4 = l2;
        int index = 0;
        while(head != null){
            if(index %2  == 0){
                l3.next = head;
                l3 = l3.next;
            }else{
                l4.next = head;
                l4 = l4.next;
            }
            head = head.next;
            index++;
        }
        l3.next = l2.next;
        l4.next = null;
        return l1.next;
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
        oddEvenList(l1);
    }
}

public class a22 {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        int num = 0;
        while(head!=null){
            num++;
            head = head.next;
        }
        if(k == num) return fast;
        int index = 0;
        while(fast != null){
            fast = fast.next;
            index++;
            if(num - k <= index){
                slow = slow.next;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
        ListNode kthFromEnd=getKthFromEnd(l1, 2);


        while (kthFromEnd != null){
            System.out.println(kthFromEnd.val);
            kthFromEnd = kthFromEnd.next;
        }

    }
}

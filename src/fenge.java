public class fenge {
    public static ListNode partition(ListNode head, int x) {
        //小于
        ListNode l1 = new ListNode(-1);
        ListNode l2 = l1;
        //大于
        ListNode l3 = new ListNode(-1);
        ListNode l4 = l3;
        while(head != null){
            if(head.val < x){
                l2.next = head;
                l2 = head;
            }else{
                l4.next = head;
                l4 = head;
            }
            head = head.next;
        }
        l2.next = null;
        l2.next = l3.next;
        return l1.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(2);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        ListNode listnode = partition(l1,3);
        while(listnode != null){
            System.out.println(l1.val);
            listnode = listnode.next;
        }
    }
}

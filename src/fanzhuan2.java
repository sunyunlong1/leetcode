public class fanzhuan2 {
    public static void reorderList(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;
        ListNode l3 = l2;
        int length = 0;
        while(l1 != null){
            length++;
            l1 = l1.next;
        }
        int index = 0;
        while(index < length / 2){
            index++;
            l3 = l3.next;
        }
        ListNode l4 = l3.next;
        l3.next = null;
        //l2前半部分，head后半部分
        //将后半部分翻转
        ListNode prev = change(l4);
        head = merge(l2,prev);
    }

    public static ListNode change(ListNode head){
        ListNode prev = null;
        ListNode next;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode l3 = l1;
        ListNode l4 = l2;
        ListNode prev = new ListNode(-1);
        ListNode result = prev;
        int index = 0;
        while(l3 != null && l4 != null){
            if(index % 2 == 0){
                prev.next = l3;
                l3 = l3.next;
            }else{
                prev.next = l4;
                l4 = l4.next;
            }
            index++;
            prev = prev.next;
        }
        if(l3 != null) prev.next = l3;
        if(l4 != null) prev.next = l4;
        return result.next;
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
        reorderList(l1);
        while(l1 != null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}

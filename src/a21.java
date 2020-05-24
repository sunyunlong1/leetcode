public class a21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode next1 = l1;
        ListNode next2 = l2;

        ListNode result = head;
        while(next1 != null && next2 != null){
            if(next1.val < next2.val){
                result.next = next1;
                next1 = next1.next;
            }else{
                result.next = next2;
                next2 = next2.next;
            }
            result = result.next;
        }
        if(next1 != null){
            result.next = next1;
        }
        if(next2 != null){
            result.next = next2;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;

        ListNode listNode=mergeTwoLists(l1, l4);
        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}
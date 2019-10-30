package a2;

/**
 * @ClassName ListNode
 * @Decription ListNode
 * @Auther yunlong.sun
 * @Date 2019-10-30 17:06
 * @Version 1.0
 **/
public class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}

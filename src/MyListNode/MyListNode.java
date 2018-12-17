package MyListNode;

/**
 * 反转链表.
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/17 10:18
 */

public class MyListNode {

  public static void main(String[] args) {
    ListNode listNode = new ListNode(1);
    listNode.next = new ListNode(2);
    listNode.next.next = new ListNode(3);
    listNode.next.next.next = new ListNode(4);
    listNode.next.next.next.next = new ListNode(5);
    ListNode reverse = reverse(listNode);
    for (int i=0;i<5;i++){
      System.out.println(reverse.date);
      reverse = reverse.next;
    }
  }

  private static ListNode reverse(ListNode listNode) {
    if (listNode == null) {
      return null;
    }
    ListNode head = listNode;
    ListNode next = null;
    ListNode prev = null;
    while (head!=null){
      next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }

}

class ListNode {

  public int date;
  public ListNode next;

  public ListNode(int date) {
    this.date = date;
  }

  public int getDate() {
    return date;
  }

  public void setDate(int date) {
    this.date = date;
  }

  public ListNode getNext() {
    return next;
  }

  public void setNext(ListNode next) {
    this.next = next;
  }
}
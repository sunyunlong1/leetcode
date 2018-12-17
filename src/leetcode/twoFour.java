package leetcode;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3. 说明:
 * 0-> 1-> 2-> 3-> 4
 * l1  l2
 * 2->1->3->4
 *    l1 l2
 *
 * 你的算法只能使用常数的额外空间。 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/17 16:21
 */

public class twoFour {

  public static ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode dump = new ListNode(0);
    dump.next = head;
    ListNode l1 = dump;
    ListNode l2 = head;
    while (l2 != null && l2.next != null) {
      ListNode nextStart = l2.next.next;
      l1.next = l2.next;
      l2.next.next = l2;
      l2.next = nextStart;
      l1 = l2;
      l2 = l2.next;
    }
    return dump.next;
  }

  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    ListNode listNode = swapPairs(node);
    for (int i = 0; i < 4; i++) {
      System.out.println(listNode.val);
      listNode = listNode.next;
    }
  }
}

class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}

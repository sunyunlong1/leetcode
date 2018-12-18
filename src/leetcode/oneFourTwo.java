package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * 给定一个链表，判断链表中是否有环。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 * 3 -> 2 -> 0 -> -4
 * |          |
 * |____<_____|
 *
 *
 * 示例 2：
 *
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 * 1 -> 2
 * |    |
 * |_<__|
 *
 * 示例 3：
 *
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 *
 * 1
 *
 *
 * 进阶：
 *
 * 你能用 O(1)（即，常量）内存解决此问题吗？
 *
 * @author sunyunlong5
 * @version 1.0
 * @since 2018/12/18 9:38
 */

public class oneFourTwo {
  public ListNode detectCycle(ListNode head) {
      if(head==null || head.next==null){
        return null;
      }
      ListNode l1 = head;
      ListNode l2 = head;
      while(l2!=null&&l2.next!=null){
        l1 = l1.next;
        l2 = l2.next.next;
        if(l1==l2){
          l1=head;

          while(l1!=l2){
            l1 = l1.next;
            l2 = l2.next;
          }
          return l1;
        }
      }
      return null;
  }
}

package a2;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode l3 = result;
        int index = 0;
        while (l1 != null || l2 != null) {
            int p1 = l1 == null ? 0 : l1.val;
            int p2 = l2 == null ? 0 : l2.val;
            int sum = p1 + p2 + index;
            index = sum / 10;
            l3.val = sum % 10;
            if ((l1 !=null && l1.next !=null) || (l2 != null && l2.next !=null)){
                l3.next = new ListNode(sum % 10);
                l3 = l3.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if(index > 0){
            l3.next = new ListNode(index);
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(4);
//        ListNode l3 = new ListNode(3);
//
//        l1.next = l2;
//        l2.next = l3;

        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
//        ListNode l6 = new ListNode(4);
        l4.next = l5;
//        l5.next = l6;

        ListNode listNode = addTwoNumbers(l1, l4);
        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

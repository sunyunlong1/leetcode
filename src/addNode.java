import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class addNode {
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            StringBuilder s1 = new StringBuilder();
            while(l1 != null){
                s1.append(String.valueOf(l1.val));
                l1 = l1.next;
            }
            StringBuilder s2 = new StringBuilder("");
            while(l2 != null){
                s2.append(String.valueOf(l2.val));
                l2 = l2.next;
            }
            Integer i1 = Integer.valueOf(s1.toString());
            Integer i2 = Integer.valueOf(s2.toString());
            int sum = i1+i2;
            String s = String.valueOf(sum);
            List<ListNode> list = new ArrayList<>();
            for(int i = 0;i<s.length();i++){
                ListNode l = new ListNode(Integer.valueOf(String.valueOf(s.charAt(i))));
                list.add(l);
            }
            for(int i=0;i<list.size()-1;i++){
                list.get(i).next = list.get(i+1);
            }
            return list.get(0);
        }


    public static void main(String[] args) {
//        ListNode l1 = new ListNode(0);
//        ListNode l2 = new ListNode(7);
//        ListNode l3 = new ListNode(3);
//        l2.next = l3;
//        ListNode listNode=addTwoNumbers(l1 l2);
//        while(listNode != null){
//            System.out.println(listNode.val);
//            listNode = listNode.next;
//        }
//        [2432432432432432432432432432432432432432432432432432432432439]
//[5642432432432432432432432432432432432432432432432432432439999]
        String str = "2432432432432432432432432432432432432432432432432432432432439";
        BigDecimal b1 = new BigDecimal(str);
        String str2 = new String("5642432432432432432432432432432432432432432432432432432439999");
        BigDecimal b2 = new BigDecimal(str2);
        BigDecimal add=b1.add(b2);
        System.out.println(add);
    }
}

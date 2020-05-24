public class test725 {
    public static ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] array = new ListNode[k];
        int length = 0;
        ListNode l0 = root;
        while(l0 != null){
            length++;
            l0 = l0.next;
        }
        int[] part = part(length,k);
        for(int i = 0;i<part.length;i++){
            if(part[i] == 0){
                array[i] = null;
                continue;
            }
            ListNode l1 = root;
            ListNode l2 = l1;
            for(int j = 1;j<part[i];j++){
                l2 = l2.next;
            }
            root = l2.next;
            l2.next = null;
            array[i] = l1;
        }
        return array;
    }

    public static int[] part(int length,int k){
        int[] result = new int[k];
        if(length <= k){
            for(int i = 0;i<length;i++){
                result[i] = 1;
            }
            return result;
        }
        int index = 1;
        while(index < k){
            result[k-index] = length / k;
            length = length - (length / k);
            k = k-1;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);




        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        ListNode[] listNodes=splitListToParts(l1, 3);
        System.out.println(1);
    }
}

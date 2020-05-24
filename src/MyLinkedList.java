public class MyLinkedList {
    int size;
    ListNode head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        size =0;
        head = new ListNode(0);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        ListNode cur = head;
        for(int i = 0;i<index+1;i++){
            cur = cur.next;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode prev = new ListNode(val);
        ListNode l1 = head.next;
        prev.next = l1;
        head.next = prev;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode l1 = head;
        while(l1.next != null){
            l1 = l1.next;
        }
        ListNode l2 = new ListNode(val);
        l1.next = l2;
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        if(index < 0){
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        ListNode l1 = head;
        for(int i = 0;i<index;i++){
            l1 = l1.next;
        }
        ListNode l2 = new ListNode(val);
        ListNode l3 = l1.next;
        l2.next = l3;
        l1.next = l2;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index > size || index < 0) return;
        ListNode l1 = head;
        for(int i = 0;i<index+1;i++){
            l1 = l1.next;
        }
        l1.next = l1.next.next;
        size--;
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        linkedList.get(1);            //返回2
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        linkedList.get(1);            //返回3
        System.out.println(1);
    }
}

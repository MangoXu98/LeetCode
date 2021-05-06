package linkedList;

import java.util.LinkedList;

public class C206 {
    public static void main(String[] args) { 
        ListNode next2 = new ListNode(3);
        ListNode next1 = new ListNode(2,next2); 
        ListNode head = new ListNode(1,next1);
        Solution_1 solution = new Solution_1();
        System.out.println(solution.reverseList(head));
    }

    /**
     * 206. 反转链表 反转一个单链表。
     */
    static class Solution_1 {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode cur = head;
            while(cur!=null){
                ListNode tmp = cur.next;
                cur.next=prev;
                prev = cur;
                cur=tmp;
            }
            return prev; 
        }
    }

}

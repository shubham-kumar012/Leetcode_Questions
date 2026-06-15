// Leetcode - https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) {
            return null;
        }

        ListNode t1 = head;
        ListNode t2 = head.next.next;

        while(t1 != null && t2 != null) {
            if(t1.next == null || t2 == null || t2.next == null) {
                break;
            }

            t1 = t1.next;
            t2 = t2.next.next;
        }

        t2 = t1.next.next;
        t1.next = t2;

        return head;

    }
}

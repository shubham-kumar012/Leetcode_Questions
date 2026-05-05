// Leetcode - https://leetcode.com/problems/rotate-list/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int n = 0;

        // find the size of LL
        ListNode temp = head;
        while(temp != null) {
            n++;
            temp = temp.next;
        }

        // edge case
        if(n == 0 || head == null) return head;
        
        k = k % n;

        while(k != 0) {
            ListNode sl = head; // second last node
            ListNode l = head; // last node

            // point to sl to the second last node
            while(sl.next.next != null) {
                sl = sl.next;
            }

            l = sl.next;

            sl.next = null;
            l.next = head;
            head = l;
            k--;
        }


        return head;
    }
}

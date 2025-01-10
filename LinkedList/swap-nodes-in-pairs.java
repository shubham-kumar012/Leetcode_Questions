// Q.24 Medium
// Leetcode - https://leetcode.com/problems/next-greater-node-in-linked-list/description

// T.C. -> O(n) 
// S.C. -> O(1)
class Solution {
    public ListNode swapPairs(ListNode head) {
        // Make Dummy Node pointed to head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // make a point on dummy node
        ListNode point = dummy;
        

        while(point.next != null && point.next.next != null) {
            // place our swapes
            ListNode temp1 = point.next;
            ListNode temp2 = temp1.next;

            // Actual Swapping 
            temp1.next = temp2.next;
            temp2.next = temp1;

            // Replacing our pointers 
            point.next = temp2;
            point = temp1;
        }

        return dummy.next;
    }
}

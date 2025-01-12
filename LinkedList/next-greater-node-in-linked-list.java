// Q. 1019 Medium
// Leetcode - https://leetcode.com/problems/next-greater-node-in-linked-list/description

// T.C. - O(n^2)
// S.C. - O(1)
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        // find the size of LinkedList
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }

        // initialize our resultant array
        int[] res = new int[size];

        temp = head;
        int i = 0; // iterator for res array
        while(temp != null) {
            ListNode temp2 = temp.next;
            int nextGreater = 0;
            while(temp2 != null) {
                if(temp2.val > temp.val) {
                    nextGreater = temp2.val;
                    break;
                }
                temp2 = temp2.next;
            }
            res[i] = nextGreater;
            i++;
            temp = temp.next;
        }

        return res;
    }
}

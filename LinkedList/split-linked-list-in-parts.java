// Time Complexity - O(n + k)
// Space Complexity - O(k)
// Leetcode - https://leetcode.com/problems/split-linked-list-in-parts/

class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];

        // find the size of head list
        ListNode curr = head;
        int listSize = 0;
        while(curr != null) {
            listSize++;
            curr = curr.next;
        }

        int baseSize = listSize / k;
        int extra = listSize % k;

        curr = head;
        for(int i=0; i<k; i++) {
            // if curr already point to null
            if(curr == null) {
                res[i] = null;
                continue;
            }
            
            res[i] = curr;

            int partSize = baseSize + (i < extra ? 1 : 0);

            for(int j=1; j<partSize; j++) {
                curr = curr.next;
            } 

            ListNode next = curr.next;
            curr.next = null;
            curr = next;
        }

        return res;
    }
}

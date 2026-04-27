// Time Complexity - O(n), n- number of nodes
// Space Complexity - O(k), k-size of nums
// Leetcode - https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        ListNode curr = head;
        ListNode prev = new ListNode(-1);
        prev.next = head;
        while(curr != null) {
            if(set.contains(curr.val)) {
                prev.next = curr.next;
                if(curr == head) {
                    head = head.next;
                }
            } else {
                prev = prev.next;
            }
            
            curr = curr.next;
        }

        return head;
    }
}

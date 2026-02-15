// Time Complexity - O(n+m)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/merge-in-between-linked-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode list1St = list1;
        ListNode list1End = list1;

        // Placing the pointer to the places where unrequired part is to be removed
        //           L1St            L2End  (pointer)
        // 10 -> 1 -> 13 -> 6 -> 9 -> 5     (list)
        // 0     1     2    3    4    5     (index)
        while(a != 1) {
            list1St = list1St.next;
            a--;
        }

        while(b != -1) {
            list1End = list1End.next;
            b--;
        }

        // Placing a pointer to the end of list2
        ListNode list2End = list2;
        while(list2End.next != null) {
            list2End = list2End.next;
        }

        // Connecting the list2 between the list1
        list1St.next = list2;
        list2End.next = list1End;

        return list1;
    }
}

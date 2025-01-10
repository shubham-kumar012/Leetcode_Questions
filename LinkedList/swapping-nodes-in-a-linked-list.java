// Q.1721 Medium
// Leetcode - https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description

// T.C. -> O(n + k + l)
// S.C. -> O(1)
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        // corner case
        if(head==null ||head.next==null||k<1){
            return head;
        }

        // find the size of this LinkedList
        int size = 0;
        ListNode temp = head;
        while(temp != null) { // O(n)
            size++;
            temp = temp.next;
        }

        // put a temp pointer to beginning kth position
        temp = head;
        for(int i=1; i<k; i++) { // O(k)
            temp = temp.next;
        }

        // put a temp2 pointer to last kth position
        ListNode temp2 = head;
        int lastPos = (size-k) + 1; //4
        for(int i=1; i<lastPos; i++) { // O(l)
            temp2 = temp2.next;
        }

        // now swap those two 
        // Note: we are just changing the value not actually swapping them
        int helper = temp.val;
        temp.val = temp2.val;
        temp2.val = helper;

        return head;
    }
}

// Q.1290 Easy
// Leetcode - https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int getDecimalValue(ListNode head) {
        int dec_Num = 0;

        // temp node point to head
        ListNode temp = head;
        // Storing size for Linklist
        int size = 0;
        while(temp != null) { // O(n)
            size++;
            temp = temp.next;
        }

        // Now again temp point to the head
        temp = head;
        // store power 
        int pow = size-1;

        // Now calculating our decimal number
        while(temp != null) { // O(n)
            if(temp.val == 1) {
                dec_Num += Math.pow(2, pow);
            }
            temp = temp.next;
            pow--;
        }

        return dec_Num;
    }
}

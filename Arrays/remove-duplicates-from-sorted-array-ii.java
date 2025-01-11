// Q.80 Medium
// Leetcode - https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int el : nums) {
            if(i == 0 || i == 1 || el != nums[i-2]) {
                nums[i++] = el;
            }
        }

        return i;
    }
}

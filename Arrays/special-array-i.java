// Q.3151 Easy
// Leetcode -> https://leetcode.com/problems/special-array-i/description/

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            if((nums[i]&1) == 1 && (nums[i+1]&1) == 1) return false; // check both odd -> false
            else if((nums[i]&1) == 0 && (nums[i+1]&1) == 0) return false; // check both even -> false
        }
        return true; // true -> if both all pair are diff.
    }
}

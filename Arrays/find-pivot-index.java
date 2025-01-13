// Q. 724 Easy
// Leetcode - https://leetcode.com/problems/find-pivot-index/description/

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        int[] suffix = new int[n];
        suffix[n-1] = nums[n-1];
        
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + nums[i];
            suffix[(n-1)-i] = suffix[(n-1)-i+1] + nums[(n-1)-i];
        }

        for(int i = 0; i < n; i++) {
            if(prefix[i] == suffix[i]) {
                return i;
            }
        }

        return -1;
    }
}

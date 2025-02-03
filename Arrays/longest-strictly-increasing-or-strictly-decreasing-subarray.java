// Q.3105 Easy
// Leetcode - https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/description

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int SD = 1; // Strictly Decreasing
        int SI = 1; // Strictly Increasing
        int n = nums.length;
        // Calculate SD(strictly decreasing)
        int DC = 1; // (decreasing counter)
        for(int i=1; i<n; i++) {
            if(nums[i] < nums[i-1]){
                SD = Math.max(SD, ++DC);
            }else {
                DC = 1;
            }
        }

        // Calculate SI(strictly increasing)
        int IC = 1; // (increment counter)
        for(int i=1; i<n; i++) {
            if(nums[i] > nums[i-1]) {
                SI = Math.max(SI, ++IC);
            } else {
                IC = 1;
            }
        }

        return Math.max(SD, SI); // return the maximum 
    }
}

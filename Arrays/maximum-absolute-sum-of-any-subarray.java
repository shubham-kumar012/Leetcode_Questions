// Q.1749 Medium
// Leetcode - https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;

        int maxSubSum = nums[0];
        int minSubSum = nums[0];

        // finding max subarray sum
        int currSubSum = nums[0];
        for(int i=1; i<n; i++) {
            currSubSum = Math.max(nums[i], currSubSum+nums[i]);
            maxSubSum = Math.max(currSubSum, maxSubSum);
        }
        // finding min subarray sum
        currSubSum = nums[0];
        for(int i=1; i<n; i++) {
            currSubSum = Math.min(nums[i], currSubSum+nums[i]);
            minSubSum = Math.min(currSubSum, minSubSum);
        }

        int ans = Math.max(Math.abs(maxSubSum),Math.abs(minSubSum));

        return ans;
    }
}

// Q.1800 Easy
// Leetcode - https://leetcode.com/problems/maximum-ascending-subarray-sum

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int tempSum = maxSum;
        for(int i=1; i<n; i++) {
            if(nums[i] > nums[i-1]) {
                tempSum += nums[i];
            } else {
                tempSum = nums[i];
            }
            maxSum = Math.max(tempSum, maxSum);
        }
        return maxSum;
    }
}

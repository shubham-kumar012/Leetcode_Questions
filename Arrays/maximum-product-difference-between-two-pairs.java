// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/maximum-product-difference-between-two-pairs/

class Solution {
    public int maxProductDifference(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] > max) {
                secMax = max;
                max = nums[i];
            } else if(nums[i] > secMax) {
                secMax = nums[i];
            }
            if(nums[i] < min) {
                secMin = min;
                min = nums[i];
            } else if(nums[i] < secMin) {
                secMin = nums[i];
            }
        }

        return (max * secMax) - (min * secMin);
    }
}

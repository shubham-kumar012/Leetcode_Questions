// Time Compelxit - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/smallest-index-with-equal-value/description/

class Solution {
    public int smallestEqual(int[] nums) {
        int res = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {
            if((i % 10) == nums[i]) {
                res = Math.min(res, i);
            }
        }

        return (res > 100) ? -1 : res;
    }
}

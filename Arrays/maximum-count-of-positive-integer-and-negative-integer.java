// Q.2529 Easy
// Leetcode - https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/

// T.C. - O(n)
// S.C. - O(1)
class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int countPos = 0;
        int countNeg = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) continue;
            if(nums[i] < 0) {
                countNeg++;
            } else {
                countPos++;
            }
        }

        return (int)Math.max(countNeg, countPos);
    }
}

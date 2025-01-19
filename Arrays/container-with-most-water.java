// Q.11 Medium
// Leetcode - https://leetcode.com/problems/container-with-most-water/description/

// T.C. - O(n)
// S.C. - O(1)
class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;

        int i = 0;
        int j = n-1;
        int maxContainedWater = Integer.MIN_VALUE;
        while(i < j) {
            // Finding height & width
            int height = Math.min(nums[i], nums[j]);
            int width = j - i;

            maxContainedWater = Math.max(height * width, maxContainedWater);
            // Increase Pointers
            if(nums[i] < nums[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxContainedWater;
    }
}

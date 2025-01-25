// Q.2148 Easy
// Leetcode - https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/description

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int countElements(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // Find min and max value
        for(int num : nums) {
            min = Math.min(num, min);
            max = Math.max(num, max);
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            if(min < nums[i] && max > nums[i]) {
                count++;
            }
        }
        return count;
    }
}

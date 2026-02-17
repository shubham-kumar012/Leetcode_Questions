// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/ant-on-the-boundary

class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n = nums.length;
        int antPos = nums[0];
        int atBoundaryCount = 0;
        
        for(int i=1; i<n; i++) {
            antPos += nums[i];
            if(antPos == 0) atBoundaryCount++;
        }

        return atBoundaryCount;
    }
}

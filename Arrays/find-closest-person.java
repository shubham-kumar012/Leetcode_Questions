// Time complexity - O(n)
// Space Complexity - O(1)

class Solution {
    public int alternatingSum(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i=0; i<n; i++) {
            if((i & 1) == 1) { // odd
                res -= nums[i];
            } else {
                res += nums[i];
            }
        }

        return res;
    }
}

// Leetcode - https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/

class Solution {
    public int countPairs(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                int t = i*j;

                if(nums[i] == nums[j] && (t%k) == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}

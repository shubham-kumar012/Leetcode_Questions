// Time Complexity - O(n + m)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/

class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        int minOpr = 0;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        
        if(sum < k) return sum;

        while(sum > 0) {
            if((sum % k) == 0) {
                break;
            } 

            sum = sum - 1;
            minOpr++;
        }

        return minOpr;
    }
}

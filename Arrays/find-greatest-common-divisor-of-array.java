// Time Complexity - O(N + log(min(nums)))
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/find-greatest-common-divisor-of-array/

class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length; 
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
            if(nums[i] > max) {
                max = nums[i];
            }
        }

        int divisor = min, divident = max, res = max / min, rem = max % min;

        while(rem > 0) {
            int prevDivisor = divisor;
            divisor = divident - (divisor * res);
            divident = prevDivisor;
            res = divident / divisor;
            rem = divident % divisor;
        }

        return divisor;
    }
}

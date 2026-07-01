// Time Complexity - O(nlogm)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/count-digit-appearances/

class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length;
        int res = 0;

        for(int i=0; i<n; i++) {
            int num = nums[i];

            res += findCount(num, digit);
        }

        return res;
    }

    public int findCount(int num, int digit) {
        int count = 0;
        while(num > 0) {
            int rem = num % 10;
            if(rem == digit) count++;
            num /= 10;
        }

        return count;
    }
}

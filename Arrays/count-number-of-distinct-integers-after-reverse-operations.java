// Time Complexity - O(n logn)
// Space Complexit - O(1)
// Leetcode - https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/

class Solution {
    public int reverseNum(int n) {
        int result = 0;

        while(n > 0) {
            int mod = n % 10;
            result = (result * 10) + mod;
            n = n / 10;
        }

        return result;
    }

    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            set.add(nums[i]);
            set.add(reverseNum(nums[i]));
        }

        return set.size();

    }
}

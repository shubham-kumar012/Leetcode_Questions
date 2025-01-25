// Q.3046 Easy
// Leetcode - https://leetcode.com/problems/split-the-array/description/

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];
        // Now calculating frequency
        for(int i=0; i<n; i++) {
            freq[nums[i]]++;
        }

        for(int i=0; i<101; i++) {
            if(freq[i] > 2) return false;
        }
        return true;
    }
}

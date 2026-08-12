// Time Complexity - O(N)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/

class Solution {
    public int minOperations(int[] nums) {
        // Brute force
        int n = nums.length;
        int oprNeeded = 0;

        for(int i=0; i<n; i++) {
            int j = i;
            int winSize = 3;
            if(nums[j] == 1) {
                continue;
            }

            if((j + winSize-1) >= n) return -1;

            while(j < n && winSize > 0) {
                if(nums[j] == 0) {
                    nums[j] = 1;
                } else {
                    nums[j] = 0;
                }
                winSize--;
                j++;
            }
            oprNeeded++;
        }

        for(int i=0; i<n; i++) {
            if(nums[i] == 0) {
                return -1;
            }
        }

        return oprNeeded;
    }
}

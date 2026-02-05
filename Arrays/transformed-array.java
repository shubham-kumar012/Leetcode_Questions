// Time Complexity - O(N)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/transformed-array/

class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];


        // Method 1
        // for(int i=0; i<n; i++) {
        //     int cal_idx = 0;
        //     if(nums[i] > 0) {
        //         cal_idx = (i + (nums[i])) % n;
        //         res[i] = nums[cal_idx];
        //     } 
        //     else if(nums[i] < 0) {
        //         cal_idx = (((i + nums[i]) % n) + n) % n;
        //         res[i] = nums[cal_idx];
        //     } else {
        //         res[i] = nums[i];
        //     }
        // }

        // Method 2
        for(int i=0; i<n; i++) {
            int shift = nums[i] % n;
            
            int newIdx = (i + shift) % n;

            if(newIdx < 0) {
                newIdx = newIdx + n;
            }

            res[i] = nums[newIdx];
        }


        return res;
    }
}

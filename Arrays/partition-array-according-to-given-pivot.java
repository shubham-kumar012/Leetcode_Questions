// Q.2161 Medium
// Leetcode - https://leetcode.com/problems/partition-array-according-to-given-pivot/description/

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // Method 1 - Using 3 for loop
        int n = nums.length;
        int[] res = new int[n];
        int idx = 0; // pointer for res array

        for(int i=0; i<n; i++) {
            if(nums[i] < pivot) {
                res[idx] = nums[i];
                idx++;
            }
        }

        for(int i=0; i<n; i++) {
            if(nums[i] == pivot) {
                res[idx] = nums[i];
                idx++;
            }
        }

        for(int i=0; i<n; i++) {
            if(nums[i] > pivot) {
                res[idx] = nums[i];
                idx++;
            }
        }

        return res;
    }
}

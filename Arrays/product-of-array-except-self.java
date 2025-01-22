// Q.238 Medium
// Leetcode -> https://leetcode.com/problems/product-of-array-except-self/description

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        // count 0's
        int count = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] == 0) count++;
        }
        // if 0's count is zero
        if(count == 0) {
            int prod = 1; // find product
            for(int i=0; i<n; i++) {
                prod *= nums[i];
            }
            for(int i=0; i<n; i++) {
                res[i] = prod / nums[i];
            }
        } else if(count == 1) { // if 0's count is 1
            int idx = -1;
            for(int i=0; i<n; i++) { // identify index with value 0
                if(nums[i] == 0) {
                    idx = i;
                    break;
                }
            }
            int prod = 1;
            for(int i=0; i<n; i++) { // product except that index
                if(i == idx) continue;
                prod *= nums[i];
            }
            res[idx] = prod; // fill that prod on that idx
        }

        return res;
    }
}

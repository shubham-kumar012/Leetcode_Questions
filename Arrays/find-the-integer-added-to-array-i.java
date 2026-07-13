// Time Complexity - O(N)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/find-the-integer-added-to-array-i/

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int sum1 = 0, sum2 = 0;

        for(int i=0; i<n; i++) {
            sum1 += nums1[i];
            sum2 += nums2[i];
        }

        if(sum1 == sum2) return 0;


        return (sum2 - sum1) / n; 
    }
}

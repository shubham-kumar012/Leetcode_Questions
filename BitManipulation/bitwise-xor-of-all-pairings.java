// Q.2425 Medium
// Leetcode -> https://leetcode.com/problems/bitwise-xor-of-all-pairings/description/

// T.C. -> O(m + n)
// S.C. -> O(1)
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int xor = 0;
        // a ^ a = 0
        // so if any nums1 length is even and nums2 length are odd, so nums2 all element occur even time those result will 0, so we consider only xor of nums1. and that will be our final ans
        // so just like we create this conditions
        if(m % 2 == 0 && n % 2 != 0) {// if nums1 is even and nums2 is not even
            for(int i=0; i<m; i++) { // O(m)
                xor = xor ^ nums1[i];
            }
        } else if(m % 2 != 0 && n % 2 == 0) {// if nums1 is odd and nums2 is even
            for(int i=0; i<n; i++) { // O(n)
                xor = xor ^ nums2[i];
            }
        } else if(m % 2 != 0 && n %2 != 0) {// if nums1 and nums2 both are odd
            for(int i=0; i<m; i++) { // O(m)
                xor = xor ^ nums1[i];
            }

            for(int i=0; i<n; i++) { // O(n)
                xor = xor ^ nums2[i];
            }
        }

        return xor;
    }
}

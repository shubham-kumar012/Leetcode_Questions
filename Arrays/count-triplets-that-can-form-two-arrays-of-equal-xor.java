// Time Complexity -  O(n^2)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/

class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length + 1;
        int res = 0;
        int[] prefix = new int[n];

        prefix[0] = arr[0];
        for(int i=1; i<n; ++i) {
            prefix[i] = arr[i-1] ^ prefix[i-1];
        }

        for(int i=0; i<n; ++i) {
            for(int j=i+1; j<n; ++j) {
                if(prefix[i] == prefix[j]) {
                    res += j - i - 1;
                }
            }
        }

        return res;
    }
}

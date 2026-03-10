// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/decode-xored-array/

class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;

        int arr[] = new int[n+1];
        arr[0] = first;

        for(int i=0; i<n; i++) {
            int x = arr[i] ^ encoded[i];
            arr[i+1] = x;
        }
        return arr;
    }
}

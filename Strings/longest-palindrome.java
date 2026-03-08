// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/longest-palindrome/

class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[256];

        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i) - 'A']++;
        }

        int ans = 0;
        boolean hasOne = false;
        for(int i=0; i<256; i++) {
           if(freq[i] % 2 == 0) {
            ans += freq[i];
           } else {
            ans += freq[i] - 1;
            hasOne = true;
           }
        }

        return hasOne ? ans + 1 : ans;
    }
}

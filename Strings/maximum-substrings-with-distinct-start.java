// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/maximum-substrings-with-distinct-start/

class Solution {
    public int maxDistinct(String s) {
        int res = 0;

        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] <= 0) {
                res++;
                freq[s.charAt(i) - 'a']++;
            }
        }

        return res;
    }
}

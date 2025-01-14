// Q.1941 Easy
// Leetcode - https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/description/

// T.C. - O(n)
// S.C. - O(1)
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        
        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int occurence = freq[s.charAt(0) - 'a'];

        for(int i = 0; i < 26; i++) {
            if(freq[i] <= 0) continue;
            if(freq[i] != occurence) return false;
        }

        return true;
    }
}

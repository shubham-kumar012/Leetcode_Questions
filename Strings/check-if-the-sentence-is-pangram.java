// Time Complexity - O(N)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];

        for(int i=0; i<sentence.length(); i++) {
            char ch = sentence.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i=0; i<26; i++) {
            if(freq[i] == 0) {
                return false;
            }
        }

        return true;
    }
}

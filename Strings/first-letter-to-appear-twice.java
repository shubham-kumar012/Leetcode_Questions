// Q.2351 Easy
// Leetcode - https://leetcode.com/problems/first-letter-to-appear-twice/description/

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public char repeatedCharacter(String s) {
        char[] freq = new char[26];
        char ans = s.charAt(0);
        for(int i=0; i<freq.length; i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;

            if(freq[ch - 'a'] > 1) {
                ans = ch;
                break;
            }
        }

        return ans;
    }
}

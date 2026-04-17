// Time Complexity - O(n)
// Space Complexity - (1)
// Leetcode - https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n = words.size();
        if(n != s.length()) return false;

        for(int i=0; i<n; i++) {
            if(s.charAt(i) != words.get(i).charAt(0)) {
                return false;
            }
        }

        return true;
    }
}

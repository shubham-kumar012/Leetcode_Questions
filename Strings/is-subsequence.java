// Q.392 Easy
// Leetcode - https://leetcode.com/problems/is-subsequence/description

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public boolean isSubsequence(String s, String t) {
        int a = s.length();
        int idx = 0;
        for(int i = 0; i < t.length() && idx < s.length(); i++) {
            if(s.charAt(idx) == t.charAt(i)) {
                a--;
                idx++;
            }
        }

        return (a <= 0) ? true : false;
    }
}

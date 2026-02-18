// Time Complexity - O(n)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/reverse-string-prefix/

class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder res = new StringBuilder();

        res.append(s.substring(0, k));
        res.reverse();
        
        s = res.toString() + s.substring(k);

        return s;
    }
}

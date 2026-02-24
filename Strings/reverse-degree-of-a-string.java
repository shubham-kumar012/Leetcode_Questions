// Time Complexity - O(N)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/reverse-degree-of-a-string/

class Solution {
    public int reverseDegree(String s) {
        int res = 0;

        for(int i=0; i<s.length(); i++) {
            int revDegree = 'z' - s.charAt(i) + 1;
            res += revDegree * (i+1);
        }

        return res;
    }
}

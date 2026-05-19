// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/

class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();

        if((n & 1) == 0) {
            for(int i=0; i<n-1; i++) {
                sb.append('a');
            }
            sb.append('b');
        } else {
            for(int i=0; i<n; i++) {
                sb.append('a');
            }
        }

        return sb.toString();
    }
}

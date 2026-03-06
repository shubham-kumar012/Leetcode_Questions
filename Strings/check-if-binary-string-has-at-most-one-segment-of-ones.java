// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/

class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        int seg = 0;

        int i = 0, j = 0;
        while((i < n) && (j < n)) {
            if(s.charAt(i) == '1') { // if i pointer is 1
                if(s.charAt(i) == s.charAt(j)) { // i == j
                    j++;
                } else { // when j is 0 and i is 1
                    seg++;
                    i = j;
                }

                if(j == n) seg++; // if  string end and j reaches end then increase segment
            }
            else { // if i is 0
                i++;
                j = i;
            }
        }

        return (seg == 1) ? true : false;
    }
}

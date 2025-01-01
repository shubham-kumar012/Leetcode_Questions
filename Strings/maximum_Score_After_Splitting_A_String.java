// Q.1422 Easy
// Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).
// The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.
// Input: s = "011101"     Input: s = "00111"
// Output: 5               Output: 5

class Solution {
    public int maxScore(String s) {
        int maxScore = Integer.MIN_VALUE;
        int n = s.length();
        // record Count for '1'
        int oneCount = 0;
        for(int i=0; i<n; i++) {
            if(s.charAt(i)=='1') oneCount++;
        }

        int zeroCount = 0;
        for(int i=0; i<n-1; i++) {
            if(s.charAt(i)=='0') zeroCount++;
            else oneCount--;

            maxScore = Math.max(maxScore, zeroCount+oneCount);
        }

        return maxScore;
    }
}

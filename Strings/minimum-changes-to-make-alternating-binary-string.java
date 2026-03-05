// Time Complexity - O(n)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/description/

class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int count = 0; // count that should change

        char[] altBin = new char[n];
        altBin[0] = '1';
        for(int i=1; i<n; i++) { // creating 1-0 base bin array
            if(altBin[i-1] == '1') {
                altBin[i] = '0';
            } else {
                altBin[i] = '1';
            }
        }

        // checking differences from alternate array
        for(int i=0; i<n; i++) {
            if(s.charAt(i) != altBin[i]) {
                count++;
            }
        }


        return Math.min(count, (n - count));
    }
}

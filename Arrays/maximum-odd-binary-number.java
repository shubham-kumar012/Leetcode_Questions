// Time complexity - O(n)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/maximum-odd-binary-number/

class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] res = new char[s.length()];
        Arrays.fill(res, '0');
        // Count the one's
        int one = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') {
                one++;
            }
        }

        res[s.length()-1] = '1';

        for(int i=0; i<s.length(); i++) {
            if(one > 1) { // because we have added one '1' already
                res[i] = '1';
                one--;
            } else {
                break;
            }
        }

        return new String(res);
    }
}

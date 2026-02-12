// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/split-a-string-in-balanced-strings

class Solution {
    public int balancedStringSplit(String s) {
        int res = 0;
        int R_Count = 0;
        int L_Count = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'R') {
                R_Count++;
            } else {
                L_Count++;
            }

            int diff = Math.abs((L_Count - R_Count));
            
            if(diff == 0) {
                res++;
                L_Count = 0;
                R_Count = 0;
            }
        }

        return res;
    }
}

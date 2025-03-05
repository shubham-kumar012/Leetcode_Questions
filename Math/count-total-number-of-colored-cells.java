// Q.2579 Medium
// Leetcode - https://leetcode.com/problems/count-total-number-of-colored-cells/


class Solution {
    public long coloredCells(int n) {
        // Method 1 - Using Observation
        // T.C. -> O(n)
        // S.C. -> O(1)
      
        // long ans = 1;
        // for(int i=1; i<=n; i++) {
        //     ans = ans + 4*(i-1);
        // }
        // return ans;

        // Method - 2 (with math)
        // T.C. -> O(1)
        // S.C. -> O(1)
      
        return 1 + (2 * ((long)(n-1) * n));
    }
}

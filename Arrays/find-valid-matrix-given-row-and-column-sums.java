// Time Complexity - O(n+m)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length; 

        int[][] res = new int[n][m];

        int i=0;
        int j=0;

        while(i < n && j < m) {
            res[i][j] = Math.min(rowSum[i], colSum[j]);

            rowSum[i] -= res[i][j];
            colSum[j] -= res[i][j];

            if(rowSum[i] == 0) i++;

            if(colSum[j] == 0) j++;
        }

        return res;
    }
}

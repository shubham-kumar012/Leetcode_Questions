// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/convert-1d-array-into-2d-array/

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] mat = new int[m][n];

        if((m*n) != original.length) return new int[0][0];

        int row = 0;
        int col = 0;

        int k1 = 0, k2 = n;
        while(row < m && k2 <= original.length) {
            for(int i=k1; i<=k2-1; i++) {
                mat[row][col++] = original[i];
            }
            row++;
            col = 0;
            k1 = k2;
            k2 = k2 + n;
        }

        return mat;
    }
}

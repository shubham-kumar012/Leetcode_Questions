// Time Complexity - O(M * N)
// Space Complexity - O(M + N)
// Leetcode - https://leetcode.com/problems/max-increase-to-keep-city-skyline/

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int maxTotalSum = 0;
        int m = grid.length; // rows
        int n = grid[0].length; // cols

        int[] maxRows = new int[m];
        int[] maxCols = new int[n];

        // calculating every row and col maximum
        // because grid is nxn so we can calculate maxRow and maxCol at the same time in the loop
        for(int i=0; i<m; i++) {
            int maxRow = Integer.MIN_VALUE;
            int maxCol = Integer.MIN_VALUE;
            for(int j=0; j<n; j++) {
                maxRow = Math.max(maxRow, grid[i][j]);
                maxCol = Math.max(maxCol, grid[j][i]);
            }
            maxRows[i] = maxRow;
            maxCols[i] = maxCol;
        }


        // calculating the max total sum
        for(int i=0; i<m; i++) {
            int maxRow = maxRows[i];
            for(int j=0; j<n; j++) {
                int maxCol = maxCols[j];

                int min  = Math.min(maxCol, maxRow);

                if(grid[i][j] >= min) continue;

                maxTotalSum += min - grid[i][j];
            }
        }


        return maxTotalSum;
    }
}

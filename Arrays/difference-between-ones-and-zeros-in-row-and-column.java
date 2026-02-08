// Time Complexity - O(m*n)
// Space Complexity - O(m*n)
// Leetcode - https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/

class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length; // row length
        int n = grid[0].length; // col length

        int[][] diff = new int[m][n]; // resultant matrix

        int[] row = new int[m];
        int[] col = new int[n];


        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 1) {
                    row[i] += 1;
                    col[j] += 1;
                }
            }
        }


        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                int onesRow = row[i];
                int onesCol = col[j];

                diff[i][j] = (onesRow + onesCol) - (m-onesRow) - (n-onesCol);
            }
        }

        return diff;
    }
}

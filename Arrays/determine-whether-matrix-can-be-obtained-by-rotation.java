// Time Complexity - O(n^2) - because matrix always in n x n
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

class Solution {

    public void rotate(int[][] grid) {
        int n = grid.length; // rows
        int m = grid[0].length; // cols
        // Step 1 - Transpose
        for(int i=0; i<n; i++) {
            for(int j=i; j<m; j++) {
                int temp = grid[i][j];
                grid[i][j] = grid[j][i];
                grid[j][i] = temp;
            }
        }

        // Step 2 - Reverse rows
        for(int i=0; i<n; i++) {
            int j = 0; // col start idx
            int k = m-1; // col end idx

            while(j < k) {
                // swap
                int temp = grid[i][j];
                grid[i][j] = grid[i][k];
                grid[i][k] = temp;
                j++;
                k--;
            }
        }
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int m = mat[0].length;

        for(int rc = 1; rc <= 4; rc++) {
            rotate(mat);

            boolean isMatch = true;
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    if(mat[i][j] != target[i][j]) {
                        isMatch = false;
                        break;
                    }
                }
                // if isMatch is false break the loop and again rotate
                if(!isMatch) break;
            }
            // if isMatch true return true
            if(isMatch) return true;
        }

        return false;
    }
}

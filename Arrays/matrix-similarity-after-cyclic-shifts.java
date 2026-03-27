// Time Complexity - O(n*m)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts

class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length; // row
        int n = mat[0].length; //col
        int newMat[][] = new int[m][n];

        k = k % n;

        for(int i=0; i<m; i++) {
            
            for(int j=0; j<n; j++) {
                int idx;
                // Finding new idx after k cycle
                if((i & 1) == 1) { //odd
                    idx = (j + k) % n;
                } else {
                    idx = ((j - k) + n) % n; 
                }

                newMat[i][idx] = mat[i][j]; 
            }
        }

        // Match the matrices
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(mat[i][j] != newMat[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}

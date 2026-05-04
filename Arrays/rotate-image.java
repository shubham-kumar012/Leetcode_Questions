// Time complexity - O(n^2)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];

        for(int i=0; i<(n+1)/2; i++) {
            for(int j=0; j<n / 2; j++) {
                    // Start 4 way swap
                    // temp = bottom left
                    int temp = matrix[n-1-j][i];

                    // bottom left = bottom right
                    matrix[n-1-j][i] = matrix[n - 1 - i][n - j - 1];

                    // bottom right = top right
                    matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];

                    // top right = top left
                    matrix[j][n - 1 - i] = matrix[i][j];

                    // top left = temp
                    matrix[i][j] = temp;
            }
        }

    }
}

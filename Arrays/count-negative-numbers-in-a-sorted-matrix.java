// Time Complexity - O(n^2)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix

class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length; // Row
        int n = grid[0].length; // Col

        int countNeg = 0;

        for(int i=m-1; i>=0; i--) {
            for(int j=n-1; j>=0; j--) {
                if(grid[i][j] < 0) {
                    countNeg++;
                } else break;
            }
        }

        return countNeg;
    }
}

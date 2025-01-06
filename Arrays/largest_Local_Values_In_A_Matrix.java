// Q.2373 Easy
// Leetcode - https://leetcode.com/problems/largest-local-values-in-a-matrix/description/


class Solution {

    public int maxElement(int[][] arr, int rowSt, int colSt) {
        int row = rowSt + 3;
        int col = colSt + 3;
        int maxEle = Integer.MIN_VALUE;
        for(int i=rowSt; i<row; i++) {
            for(int j=colSt; j<col; j++) {
                maxEle = Math.max(maxEle, arr[i][j]);
            }
        }
        return maxEle;
    }

    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;

        int[][] res = new int[n-2][n-2];

        for(int i=0; i<res.length; i++) {
            for(int j=0; j<res.length; j++) {
                int max = maxElement(grid, i, j);
                res[i][j] = max;
            }
        }

        return res;
    }
}

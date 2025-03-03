// Q.566 Easy
// Leetcode - https://leetcode.com/problems/reshape-the-matrix/description/

// T.C. -> O(n ^ 2)
// S.C. -> O(n)
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;  
        int m = mat[0].length;
        int totalCell = n * m;

        if(!(totalCell == r*c)) return mat;

        int[][] res= new int[r][c];
        int row = 0;
        int col = 0;
        for(int i=0; i<res.length; i++) {
            for(int j=0; j<res[0].length; j++) {
                if(col >= mat[0].length && row < mat.length) {
                    row++;
                    col = 0;
                }
                if(row == mat.length || col == mat[0].length) break;
                res[i][j] = mat[row][col];
                col++;
            }
        }

        return res;
    }
}

// Time Complexity - O(m * n * (m+n))
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/special-positions-in-a-binary-matrix/

class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length; // rows
        int n = mat[0].length; // cols
        int ans = 0;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(mat[i][j] == 1) {
                    boolean flag = true; // track if position is special

                    for(int k=0; k<m; k++) { // for checking whole single column
                        if(k == i) continue;
                        if(mat[k][j] == 1) {
                            flag = false;
                            break;
                        } 
                    }

                    for(int k=0; k<n; k++) { // for checking whole single row
                        if(k == j) continue;
                        else if(!flag) break;
                        else if(mat[i][k] == 1) {
                            flag = false;
                            break;
                        }
                    }

                    if(flag) ans++;
                }
            }
        }

        return ans;
    }
}

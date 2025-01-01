// Q.1572 Matrix Diagonal Sum (Easy)   
// Input: mat = [[1,2,3],   Input: mat = [[1,1,1,1],
//              [4,5,6],                 [1,1,1,1],
//              [7,8,9]]                 [1,1,1,1],
//        Output: 25                     [1,1,1,1]]
//                                       Output: 8

// Brute Force
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(i==j){
                    sum += mat[i][j];
                }
                else if((i+j)==n-1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}



// Optimize Solution ---> O(n+m) or if n>>m then O(n) or if m>>n then O(m)
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0; i<n; i++) {
            // primary diagonal
            sum += mat[i][i];

            // secondary diagonal
            if(i != n-1-i) // for same element occur again and we don't have to add
                sum += mat[i][n-1-i];
            
        }
        return sum;
    }
}

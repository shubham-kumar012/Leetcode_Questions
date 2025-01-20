// Q.2133 Easy
// Leetcode -> https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/description

// T.C. -> O(n^2)
// S.C. -> O(n)
class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        // Check for rows
        for(int i=0; i<n; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j=0; j<n; j++) {
                set.add(matrix[i][j]);
            }
            if(set.size() != n) return false;
        }

        // Check for Columns
        for(int i=0; i<n; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j=0; j<n; j++) {
                set.add(matrix[j][i]);
            }
            if(set.size() != n) return false;
        }
        return true;
    }   
}

// Q.74 Search in a 2d matrix [Medium]
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true

// Brute Force
// It gives TLE Usually
// T.C. -> O(n^2)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length; 
        int m = matrix[0].length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(target==matrix[i][j]) return true;
            }
        }
        return false;
    }
}

// Using Row wise sorted property
// Implement binary search in every row to search 
// T.C. -> O(n*logn)
class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length; 
        int m = matrix[0].length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                // Using Binary Search on Every Row
                int st = 0, end = matrix[i].length-1;
                while(st <= end){
                    int mid = (st+end) / 2;
                    if(matrix[i][mid]==target) {
                        return true;
                    }
                    if(matrix[i][mid] > target) {
                        end = mid -1;
                    }
                    if(matrix[i][mid] < target) {
                        st = mid + 1;
                    }
                }
            }
        }
        return false;
    }
}

// Using StairCase Search
// T.C. => O(n + m)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Choosing Bottom Left for starting point to search
        // we can choose Top-Right corner as a starting point
        int row = matrix.length-1;
        int col = 0;

        while(row >= 0 && col < matrix[0].length) {
            if(target == matrix[row][col]) {
                return true;
            }

            if(target < matrix[row][col]) {
                row--;
            }
            else if(target > matrix[row][col]) {
                col++;
            }
        }
        return false;
    }
}

Q.54 Medium

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int i=startCol; i<=endCol; i++) {
                result.add(matrix[startRow][i]);
            }

            //right
            for(int i=startRow+1; i<=endRow; i++) {
                result.add(matrix[i][endCol]);
            }

            //bottom
            for(int i=endCol-1; i>=startCol; i--) {
                // if m x n are odd (to print last single element only once)
                // which is already add to an result so we don't add again
                if(startRow == endRow) break;
                result.add(matrix[endRow][i]);
            }

            //left
            for(int i=endRow-1; i>=startRow+1; i--) {
                if(startCol == endCol) break;
                result.add(matrix[i][startCol]);
            }

            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }

        return result;
    }
}

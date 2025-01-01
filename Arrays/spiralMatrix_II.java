class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int startRow = 0;
        int endRow = result.length-1;
        int startCol = 0;
        int endCol = result[0].length-1;
        int count = 1;

        while(startCol <= endCol && startRow <= endCol) {
            //top
            for(int i=startCol; i<=endCol; i++) {
                result[startRow][i] = count++;
            }

            //right
            for(int i=startRow+1; i<=endRow; i++) {
                result[i][endCol] = count++;
            }

            //bottom
            for(int i=endCol-1; i>=startCol; i--) {
                // there is no need to write any special condition because there is no single element left because of matrix is n X n not n X m
                result[endRow][i] = count++;
            }

            //left
            for(int i=endRow-1; i>=startRow+1; i--) {
                result[i][startCol] = count++;
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }

        return result;
    }
}

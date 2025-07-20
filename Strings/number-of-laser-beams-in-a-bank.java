// Q.2125 Medium
// Link - https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description


class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int m = bank[0].length();

        int currDevice = 0;
        int prevDevice = 0;
        int totalLaser = 0;


        // Approach 1 : Using Matrix
        // T.C. -> O(n*m)
        // S.C. -> O(n*m)
        // // creating 2d matrix
        // int[][] laserPos = new int[n][m];

        // Step 1: creating 2D array from bank array
        // for(int i=0; i<n; i++) {
        //     String pos = bank[i];
        //     for(int j=0; j<m; j++) {
        //         laserPos[i][j] = pos.charAt(j) - 48;
        //     }
        // }

        // Step 2: creating our result
        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<m; j++) {
        //         if(laserPos[i][j] == 1) {
        //             currDevice++;
        //         }
        //     }

        //     if(prevDevice > 0) {
        //         totalLaser += prevDevice * currDevice;
        //     }

        //     if(currDevice > 0) {
        //         prevDevice = currDevice;
        //         currDevice = 0;
        //     }
        // }

        // Approach 2 : Without Using matrix
        // T.C. -> O(n*m)
        // S.C. -> O(1)
        for(int i=0; i<n; i++) {
            String row = bank[i];

            currDevice = countLaser(row);
            if(prevDevice > 0) {
                totalLaser += currDevice * prevDevice;
            }

            if(currDevice > 0) {
                prevDevice = currDevice;
                currDevice = 0;
            }
        }

        return totalLaser;
    }

    private int countLaser(String s) {
        int n = s.length();
        int res = 0;
        for(char c : s.toCharArray()) {
            if(c == '1') {
                res++;
            }
        }

        return res;
    }
}

// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/furthest-point-from-origin/

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();

        int leftFreq = 0;
        int rightFreq = 0;
        for(int i=0; i<n; i++) {
            if(moves.charAt(i) == 'L') {
                leftFreq++;
            } else if(moves.charAt(i) == 'R') {
                rightFreq++;
            }
        }
        
        // next move depends (if 'L' move -1 otherwise('R') +1)
        int nextMove = (leftFreq > rightFreq) ? -1 : 1;

        int res = 0;

        for(int i=0; i<n; i++) {
            if(moves.charAt(i) == 'L') {
                res--;
            } else if(moves.charAt(i) == 'R') {
                res++;
            } else {
                res = res + nextMove;
            }
        }

        return Math.abs(res);
    }
}

// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/robot-return-to-origin/description/

class Solution {
    public boolean judgeCircle(String moves) {
        int r = 0;
        int c = 0;

        for(int i=0; i<moves.length(); i++) {
            char move = moves.charAt(i);
            if(move == 'U') {
                r--;
            } else if(move == 'D') {
                r++;
            } else if(move == 'L') {
                c--;
            } else {
                c++;
            }
        }

        if(r == 0 && c == 0) {
            return true;
        }

        return false;
    }
}

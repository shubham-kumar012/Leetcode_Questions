// Q.2965 Easy
// Leetcode - https://leetcode.com/problems/find-missing-and-repeated-values/description/

// T.C. -> O(n^2)
// S.C. -> O(1)
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] map = new int[2501];

        // count the frequency of each element
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                map[grid[i][j]]++;
            }
        }

        // ans will be store at
        int[] ans = new int[2];
        map[0] = 1; // fill 0 at 0 - index
        for(int i=1; i<=(n*n); i++) {
            if(map[i] == 2) {
                ans[0] = i;
            }

            if(map[i-1] > 0 && map[i] == 0) {
                ans[1] = i;
            }
        }

        return ans;
    }
}

// Time Complexity - O(n^2)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/two-furthest-houses-with-different-colors/

class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDist = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(colors[j] != colors[i]) {
                    maxDist = Math.max(maxDist, j-i);
                }
            }
        }

        return maxDist;
    }
}

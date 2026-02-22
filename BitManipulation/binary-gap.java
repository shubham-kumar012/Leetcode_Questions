// Time Complexity - O(log2 n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/binary-gap/description/

class Solution {
    public int binaryGap(int n) {
        n = n >> Integer.numberOfTrailingZeros(n);
        if(n == 1) return 0;

        int maxDist = Integer.MIN_VALUE;
        int currDist = 0;
        
        while(n != 0) {
            if((n & 1) == 1) {
                maxDist = Math.max(maxDist, currDist);
                currDist = 0;
            }
            else {
                currDist++;
            }

            n >>= 1;
        }

        return maxDist+1;
    }
}

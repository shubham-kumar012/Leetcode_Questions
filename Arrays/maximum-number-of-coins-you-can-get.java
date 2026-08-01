// Time Complexity - O(n)
// Space complexity - O(1)
// Leetcode - https://leetcode.com/problems/maximum-number-of-coins-you-can-get

class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;

        Arrays.sort(piles);
        int res = 0;
        int bob = 0;
        for(int i=n-1; i>=0; i-=2) {
            if(bob > i || (i-1) < 0) break;

            // int alice = piles[i];
            int me = piles[i-1];
            
            res += me;
            bob++;
        }

        return res;
    }
}

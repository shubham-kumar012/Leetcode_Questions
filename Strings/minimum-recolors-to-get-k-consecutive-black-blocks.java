// Q.2379 Easy
// Leetcode -> https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();

        int ans = Integer.MAX_VALUE;
        for(int i=0; i+k-1 < n; i++) {
            int changeCount = 0;
            int count = 0;
            for(int j=i; j<n; j++) {
                count++;
                if(blocks.charAt(j) == 'W') {
                    changeCount++;
                }
                if(count == k) {
                    j = n;
                }
            }
            ans = Math.min(changeCount, ans);
        }

        return ans;
    }
}

// Time complexity - O(N^2LogM)
// Space Complexity - O(1)

class Solution {
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long max = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i == j) continue;
                long g = gcd(nums[i], nums[j]);
                long curr = ((long)nums[i] * nums[j]) / (g * g);
                max = Math.max(curr, max);
            }
        }
        return max;
    }

    public int gcd(int a, int b) {
        int t = a;
        int big = Math.max(a, b);
        int small = Math.min(t, b);

        
        while(small != 0) {
            int divident = big / small;
            int rem = big % small;

            if(rem == 0) break;
            
            big = small;
            small = rem;
        }

        return small;
    }
}

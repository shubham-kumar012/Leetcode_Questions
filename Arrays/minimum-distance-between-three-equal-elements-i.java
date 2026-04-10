// Time Complexity - O(n^3)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i/

class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int goodTuple = Integer.MAX_VALUE;

        int[] freq = new int[101];

        for(int i=0; i<n; i++) {
            freq[nums[i]]++;
        }

        for(int i=0; i<n; i++) {
            if(freq[nums[i]] >= 3) {
                for(int j=i+1; j<n; j++) {
                    if(nums[j] == nums[i]) {
                        for(int k=j+1; k<n; k++) {
                            if(nums[k] == nums[j]) {
                                int currTuple = Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i);
                                goodTuple = Math.min(goodTuple, currTuple);
                            }
                        }
                    }
                }
            }
        }

        return (goodTuple == Integer.MAX_VALUE) ? -1 : goodTuple;
    }
}

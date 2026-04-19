// Time Complexity - O(n^3)
// Space Complexity - O(1)
// https://leetcode.com/problems/number-of-arithmetic-triplets/

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int countTriplet = 0;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if((nums[j] - nums[i]) > diff) {
                    j = n;
                    continue;
                }

                if((nums[j] - nums[i]) == diff) {
                    for(int k=j+1; k<n; k++) {
                        if((nums[k] - nums[j]) > diff) {
                            k = n; 
                            continue;
                        }

                        if((nums[k] - nums[j]) == diff) {
                            countTriplet++;
                        }
                    }
                }
            }
        }

        return countTriplet;
    }
}

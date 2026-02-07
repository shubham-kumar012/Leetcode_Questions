// Time Complexity - O(nlogn)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/


class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        double minAvg = Double.MAX_VALUE;

        Arrays.sort(nums);

        int i=0,j=n-1;
        while(i < j) {
            double currAvg = (nums[i] + nums[j]) / 2.0;
            minAvg = Math.min(minAvg, currAvg);
            i++; 
            j--;
        }

        return minAvg;
    }
}

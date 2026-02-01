// Time Complexity - O(n)
// Space Complexity - O(1)

class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        int sum = nums[0];

        // Assigning variables
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE; 

        // find firstMin and secondMin in array
        for(int i=1; i<n; i++) {
            if(nums[i] < firstMin) {
                secondMin = firstMin;
                firstMin = nums[i];
            } else if(nums[i] < secondMin) {
                secondMin = nums[i];
            }
        }


        return sum + firstMin + secondMin; 
    }
}

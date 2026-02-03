// TIme Complexity - O(N)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/trionic-array-i/description/


class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;

        int i = 0;
        while(i+1 < n && nums[i] < nums[i+1]) { // increasing
            i++;
        }

        if(i==0 || i == n-1) return false;

        while(i+1 < n && nums[i] > nums[i+1]) { // decreasing
            i++;
        }

        if(i == n-1) return false;

        while(i+1 < n && nums[i] < nums[i+1]) { // increasing
            i++;
        }
        

        return i == n-1;

    }
}

// Time Complexity - O(n), n=max value
// Space Complexity - O(n), n=max value
// Leetcode - https://leetcode.com/problems/check-if-array-is-good/

class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length; 

        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
        }

        if(n < max+1) return false;

        int[] arr = new int[max+1];
        for(int num : nums) {
            arr[num]++;
        }

        for(int i=1; i<=max; i++) {
            if(i==max && arr[max] != 2) {
                return false;
            } else if(i < max && arr[i] != 1) {
                return false;
            }
        }

        return true;
    }
}

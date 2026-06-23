// Time complexity - O(nlogn)
// Space Complexity - O(N)
// Leetcode - https://leetcode.com/problems/minimum-number-game/

class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        Arrays.sort(nums);

        for(int i=0; i<n-1; i+=2) {
            int a = nums[i];
            int b = nums[i+1];
            arr[i] = b;
            arr[i+1] = a;

        }

        return arr;
    }
}

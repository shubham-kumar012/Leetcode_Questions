// Time Complexity - O(2 ^ n)
// Space complexity - O(1)
// Leetcode - https://leetcode.com/problems/sum-of-all-subset-xor-totals/

class Solution {

    int sum = 0;

    public int subsetXORSum(int[] nums) {
        calXor(nums, 0, 0);
        return sum;
    }

    public void calXor(int[] nums, int index, int xor) {
        // base case 
        if(index == nums.length) {
            sum += xor;
            return;
        }

        // include element
        calXor(nums, index+1, xor ^ nums[index]);

        // exclude element
        calXor(nums, index+1, xor);
    }
}

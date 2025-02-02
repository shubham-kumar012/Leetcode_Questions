// Q.1752 Easy
// Leetcode - https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1]) count++;
        }
        count = nums[0] < nums[nums.length-1] ? ++count : count;
        return (count>1) ? false : true;
    }
}

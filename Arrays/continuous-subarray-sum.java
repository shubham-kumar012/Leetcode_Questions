// Time Complexity - O(n)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/continuous-subarray-sum/

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int cumSum = 0;
        int result = 0;

        for(int i=0; i<nums.length; i++) {
            cumSum += nums[i];
            int rem = cumSum % k;

            if(map.containsKey(rem)) {
                if((i - map.get(rem)) >= 2) {
                    return true;
                }
            }
            else {
                map.put(rem, i);
            }
        }

        return false;
    }
}

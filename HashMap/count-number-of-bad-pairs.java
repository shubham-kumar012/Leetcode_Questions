// Q.2364 Medium
// Leetcode - https://leetcode.com/problems/count-number-of-bad-pairs/description/

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    public long countBadPairs(int[] nums) { // [4 1 3 3]
        // we have to check -> j - i != nums[j] - nums[i]
        // it is also equal -> nums[i] - i != nums[j] - j , so we convert our array int this form
        long res = 0;
        int n = nums.length;
        // converting the array
        for(int i = 0; i < n; i++) { // [4 0 1 0]
            nums[i] = nums[i] - i;
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<n; i++) {
            if(freq.containsKey(nums[i])) {
                res += i - freq.get(nums[i]);
            } else {
                res += i;
            }
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1); // Increase frequency of curr element
        }
        return res;
    }
}

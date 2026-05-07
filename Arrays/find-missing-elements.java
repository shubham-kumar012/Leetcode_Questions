// Time Complexity - O(n)
// Space Complexity - O(k), where k is the max value
// Leetcode - https://leetcode.com/problems/find-missing-elements/

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
            if(nums[i] > max) {
                max = nums[i];
            }
        }

        // creating new array with max value size
        int[] arr = new int[max+1];

        for(int i=0; i<n; i++) {
            arr[nums[i]]++;
        }

        // resultant list
        List<Integer> result = new ArrayList<>();

        for(int i=min; i<max; i++) {
            if(arr[i] != 1) {
                result.add(i);
            }
        }

        return result;
    }
}

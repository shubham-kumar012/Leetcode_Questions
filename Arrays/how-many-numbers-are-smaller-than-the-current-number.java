// Q.1365 Easy
// Leetcode - https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        // Brute Force
        // int[] res = new int[n];
        // for(int i=0; i<n; i++) {
        //     int count = 0;
        //     for(int j=0; j<n; j++) {
        //         if(i==j) continue;
        //         if(nums[i] > nums[j]) {
        //             count++;
        //         }
        //     }
        //     res[i] = count;
        // }
        // return res;

        // Better Approach
        // temp array to store sorted element of nums
        int[] temp = Arrays.copyOf(nums, nums.length);
        // now sort temp
        Arrays.sort(temp);
        // Our resultant array
        int[] res = new int[n];
        // creating map to store individual element values
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=n-1; i>=0; i--) {
            mp.put(temp[i], i);
        }

        // Now making our answer
        for(int i=0; i<n; i++) {
            res[i] = mp.get(nums[i]);
        }

        return res;



    }
}

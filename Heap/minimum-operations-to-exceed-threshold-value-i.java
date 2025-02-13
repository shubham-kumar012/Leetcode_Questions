// Q.3065 Easy
// Leetcode - https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/description/

class Solution {
    public int minOperations(int[] nums, int k) {
        // Method 1 - T.C. -> O(n), S.C. -> O(n)
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int num : nums) {
        //     pq.add(num);
        // }
        // int ans = 0;
        // while(!pq.isEmpty() && pq.peek() < k) {
        //     pq.remove();
        //     ans++;
        // }

        // Better approach
        // T.C. -> O(n), S.C. -> O(1)
        int ans = 0;
        for(int num : nums) {
            if(num < k) ans++;
        }
        return ans;
    }
}

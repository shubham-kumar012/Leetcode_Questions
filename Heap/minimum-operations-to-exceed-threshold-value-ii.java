// Q.3066 Medium
// Leetcode - https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/description/ 

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int num : nums) { // O(n)
            pq.add((long) num);
        }

        int ans = 0;
        while(pq.size() > 1 && pq.peek() < k) { // O(n)
            if(pq.peek() >= k) break;
            long x = pq.remove();
            long y = pq.remove();
            long newNum = (Math.min(x,y) * 2) + Math.max(x,y);
            pq.add(newNum);
            ans++;
        }
        return ans;
    }
}

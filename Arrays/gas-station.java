// Time complexity - O(n^2)
// Space Compleixty - O(1)
// Leetcode - https://leetcode.com/problems/gas-station/submissions/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        for (int start = 0; start < n; start++) {
            int tank = 0;
            int count = 0;

            while (count < n) {
                int i = (start + count) % n;
                tank += gas[i] - cost[i];

                if (tank < 0) break;

                count++;
            }

            if (count == n) return start;

            // skip invalid starts (optimization)
            start = start + count;
        }

        return -1;
    }
}

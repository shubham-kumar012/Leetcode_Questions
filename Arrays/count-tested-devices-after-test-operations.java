// Q.2960 Easy
// Leetcode - https://leetcode.com/problems/count-tested-devices-after-test-operations/description/

// T.C. -> O(n^2)
// S.C. -> O(1)
class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int n = batteryPercentages.length;
        int count = 0;
        for(int i=0; i<n; i++) {
            if(batteryPercentages[i] > 0) {
                count++;
                for(int j=i+1; j<n; j++) {
                    batteryPercentages[j] = Math.max(0, batteryPercentages[j]-1);
                }
            }
        }
        return count;
    }
}

// Time Complexity - O(N * M)
// Space Complexity - O(N)
// Leetcode - https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] res = new int[n];

        for(int i=0; i<n; i++) {
            int num = nums.get(i);
            int tempNum = nums.get(i);
            
            int min = -1;
            while(tempNum > 0) {
                if((tempNum | (tempNum + 1)) == num) {
                    min = tempNum;
                }
                tempNum--;
            }

            res[i] = min;
        }

        return res;
    }
}

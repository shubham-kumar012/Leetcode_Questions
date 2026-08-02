// Time complexity = O(N)
// Space Complexity - O(N)

class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int n = nums.length;
        int res = 0;

        int[] prefixEven = new int[n];
        int[] prefixOdd = new int[n];

        prefixEven[0] = (nums[0] % 2 == 0) ? 1 : 0;
        prefixOdd[0] = (nums[0] % 2 != 0) ? 1 : 0;
        for(int i=1; i<n; i++) {
            prefixOdd[i] = prefixOdd[i-1];
            prefixEven[i] = prefixEven[i-1];
            
            if(nums[i] % 2 == 0) {
                prefixEven[i]++;
            } else {
                prefixOdd[i]++;
            }
        }



        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int x = 0;
                int y = 0;
                
                if(i > 0) {
                    x = prefixEven[j] - prefixEven[i-1]; // no. of even element
                    y = prefixOdd[j] - prefixOdd[i-1]; // no. of odd element
                } else {
                    x = prefixEven[j];
                    y = prefixOdd[j];
                }

                if(y > 0 && (x * b) <= (a * y)) {
                    res++;
                }
            }
        }

        return res;
    }
}©leetcode

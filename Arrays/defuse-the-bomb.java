// Time Complexity - O(N^2)
// Space Complexity - O(N)
// Leetcode - https://leetcode.com/problems/defuse-the-bomb/

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] nums = new int[n];
        Arrays.copyOf(code, n);

        for(int i=0; i<n; i++) {
            int sum = 0;

            int j = (k>0) ? i+1 : i-1;
            int t = Math.abs(k);
            if(k > 0) {
                while(t > 0) {
                    j = j % n;
                    sum += code[j];
                    t--;
                    j++;
                }   
            } else if(k < 0) {
                while(t > 0) {
                    j = (j+n) % n;
                    sum += code[j];
                    t--;
                    j--;
                }
            }

            nums[i] = sum;
        }
        return nums;
    }
}

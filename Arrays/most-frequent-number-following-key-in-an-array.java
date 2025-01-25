// Q.2190 Easy
// Leetcode - https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/description

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int mostFrequent(int[] nums, int key) {
        int n = nums.length;
        int freq[] = new int[1001];
        for(int i=0; i<n-1; i++) { // storing frequency
            if(nums[i] == key) {
                freq[nums[i+1]]++;
            }
        }
        int ans = 0;
        int maxFreq = 0;
        for(int i=0; i<1001; i++) {
            if(freq[i] > maxFreq) {
                ans = i;
            }
            if(freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }

        return ans;
    }
}

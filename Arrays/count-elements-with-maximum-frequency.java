// Q.3005 Easy
// Leetcode - https://leetcode.com/problems/count-elements-with-maximum-frequency/description

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int res = 0;
        int[] freq = new int[101];

        for(int i=0; i<n; i++) { // O(n)
            freq[nums[i]]++;
        }

        // finding maximum frequency
        int maxFreq = 0;
        for(int i=0; i<101; i++) { // O(1)
            maxFreq = Math.max(freq[i], maxFreq);
        }
        for(int i=0; i<n; i++) { // O(n)
            if(freq[nums[i]] == maxFreq) {
                res++;
            }
        }

        return res;
    }
}

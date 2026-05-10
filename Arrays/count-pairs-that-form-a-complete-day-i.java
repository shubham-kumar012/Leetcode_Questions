// Time Complexity - O(n^2)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/

class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int pair = 0;

        for(int i=0; i<hours.length; i++) {
            for(int j=i+1; j<hours.length; j++) {
                int currTime = hours[i] + hours[j];
                if(currTime % 24 == 0) {
                    pair++;
                }
            }
        }

        return pair;
    }
}

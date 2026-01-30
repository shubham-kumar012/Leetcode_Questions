// Time Complexity - O(n)
// Space Complecity - O(1)

class Solution {
    public int largestAltitude(int[] gain) {
        int highestAlt = 0;
        int currAlt = 0;

        for(int netGain : gain) {
            currAlt += netGain;
            highestAlt = Math.max(currAlt, highestAlt);
        }

        return highestAlt;
    }
}

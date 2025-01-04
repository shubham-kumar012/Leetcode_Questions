// Q.2220 Easy

// T.C. -> O(N)
// S.C. -> O(1)

 class Solution {
    public int minBitFlips(int start, int goal) {
        int flipCount = 0;

        while(start > 0 || goal > 0) {
            if((start & 1) != (goal & 1)) {
                flipCount++;
            }
            start = start>>1;
            goal = goal>>1;
        }

        return flipCount;
    }
}

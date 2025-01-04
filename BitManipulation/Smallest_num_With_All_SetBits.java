// Q.3370 Easy
// Leetcode - https://leetcode.com/problems/smallest-number-with-all-set-bits/?envType=problem-list-v2&envId=bit-manipulation
                          
// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int smallestNumber(int n) {
        for(int i=1; i<=n; i++) {
            if((1<<i) > n) {
                return (1<<i) -1;
            }
        }
        return 0;
    }
}

// Time Complexity - O(log n)
// Space Complexity - O(log n)
// Leetcode - https://leetcode.com/problems/complement-of-base-10-integer/

class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;

        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            if((n & 1) == 1) {
                sb.append('0');
            } else {
                sb.append('1');
            }
            n = n>>1;
        }


        return Integer.parseInt(sb.reverse().toString(), 2);
    }
}

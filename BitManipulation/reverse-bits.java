// Q.190 Easy

// T.C. -> O(1)
// S.C. -> O(1)
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++) {
            int bit = n & 1; // Reterieve The Least Significant Bit
            result = (result << 1) | bit; // Append Bit To Result
            n = n >>> 1; // Unsigned Right Shift
        }

        return result;
    }
}

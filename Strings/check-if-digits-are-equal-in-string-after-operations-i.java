// Time Complexity - O(n^2)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/

class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);

        // Keep reducing until length becomes 2
        while (sb.length() > 2) {
            StringBuilder next = new StringBuilder();

            for (int i = 0; i < sb.length() - 1; i++) {
                int num1 = sb.charAt(i) - '0';
                int num2 = sb.charAt(i + 1) - '0';

                next.append((num1 + num2) % 10);
            }

            sb = next; // move to next reduced string
        }

        return sb.charAt(0) == sb.charAt(1);
    }
}

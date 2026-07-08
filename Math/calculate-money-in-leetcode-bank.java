// Time Complextiy = O(n)
// Space Complextiy = O(1)
// Leetcode - https://leetcode.com/problems/calculate-money-in-leetcode-bank/

class Solution {
    public int totalMoney(int n) {
        int divisor = n / 7;
        int rem = n % 7;
        int sum = 0;

        for(int i=0; i<divisor; i++) {
            int first = i+1;
            int second = 7 + i;

            sum += (7 * (first + second)) / 2;
        }


        int first = 1 + divisor;
        int second = first + (rem - 1);

        sum += (rem * (first + second)) / 2;

        return sum;
    }
}

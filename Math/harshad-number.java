// Time Complexity - O(nlogn)
// Space Complexityi - O(1)
// https://leetcode.com/problems/harshad-number/

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp = x;
        int sum = 0;

        while(temp > 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }

        return (x%sum) == 0 ? sum : -1;
    }
}

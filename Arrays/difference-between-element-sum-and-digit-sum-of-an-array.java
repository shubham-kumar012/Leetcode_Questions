// Time Complexity - O(nlogM)
// Space Compelxity - O(1)
// Leetcode - https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/

class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int digitSum = 0;
        int elementSum = 0;

        for(int i=0; i<n; i++) {
            int num = nums[i];

            digitSum += countSum(num);
            elementSum += num;
        }

        return Math.abs(digitSum - elementSum);
    }

    public int countSum(int num) {
        int n = num;
        int sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }

        return sum;
    }
}

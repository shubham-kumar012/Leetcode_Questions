// Time complexity - O(n logm)
// Space Complexity - O(logm)
// Leetcode - https://leetcode.com/problems/maximum-number-of-balls-in-a-box/

class Solution {
    public int digitSum(int num) {
        int sum = 0;

        while(num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        return sum;
    }

    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=lowLimit; i<=highLimit; i++) {
            int sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        } 

        int max = Integer.MIN_VALUE;
        for(int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }

        return max;
    }
}

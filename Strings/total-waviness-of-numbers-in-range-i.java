// Time complexity - O(N*logM)
// Space Complexity - O(logM)
// Leetcode - https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/

class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num1 < 100) {
            num1 = 100;
        }

        if(num2 < num1) {
            return 0;
        }

        int count = 0;
        for(int i=num1; i<=num2; i++) {
            String num = String.valueOf(i);

            for(int j=1; j<num.length()-1; j++) {
                int left =(int) (num.charAt(j-1) - '0');
                int right = (int) (num.charAt(j+1) - '0');
                int mid = (int) (num.charAt(j) - '0');

                if(left < mid && right < mid) {
                    count++;
                } else if(left > mid && right > mid) {
                    count++;
                }
            }
        }


        return count;
    }
}

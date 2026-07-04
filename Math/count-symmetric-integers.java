// Space Complexity - O(d)
// Time Complexity - O(n*d), n=>high | d=digit of the number
// Leetcode - https://leetcode.com/problems/count-symmetric-integers/

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for(int num=low; num<=high; num++) {
            String s = String.valueOf(num);

            int len = s.length();
            int half = len / 2;

            if(len % 2 != 0) {
                continue;
            }

            int num1=0, num2=0;
            for(int i=0; i<half; i++) {
                int digit = (int) s.charAt(i) - '0';
                num1 += digit;
            }

            for(int i=half; i<len; i++) {
                int digit = (int) s.charAt(i) - '0';
                num2 += digit;
            }

            if(num1 == num2) count++;

        }

        return count;
    }
}

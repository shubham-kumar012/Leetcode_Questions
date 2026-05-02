// Time Complexity - O(nlogn)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/rotated-digits/

class Solution {
    public int rotateNum(int n) {
        if(n == 0 || n == 1 || n == 8) {
            return n;
        } else if(n == 2) {
            return 5;
        } else if(n == 5) {
            return 2;
        } else if(n == 6) {
            return 9;
        } else if(n == 9) {
            return 6;
        } else {
            return -1;
        }
    }

    public boolean isGood(int num) {
        int rotated = 0;
        int pow = 0;
        int temp = num;
        while(temp != 0) {
            int last = temp % 10;
            int rotateLast = rotateNum(last);
            if(rotateLast == -1) return false;

            rotated = (int) (Math.pow(10, pow) * rotateLast) + rotated;

            temp = temp / 10;
            pow++;
        }
        
        return (rotated != num) ? true : false;
    }

    public int rotatedDigits(int n) {
        int result = 0;

        for(int i=1; i<=n; i++) {
            int curr = i;
            
            if(isGood(curr)) {
                result++;
            }
        }

        return result;
    }
}

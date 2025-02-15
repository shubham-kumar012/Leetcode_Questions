// Q.2698 Medium
// Leetcode - https://leetcode.com/problems/find-the-punishment-number-of-an-integer/description

// T.C. -> O(n^2)
// S.C. -> O(logn)
class Solution {
    public boolean check(String sqr, int num, int idx, int currSum) {
        if(idx == sqr.length()) {
            return currSum == num;
        }

        if(currSum > num) {
            return false;
        }

        boolean isEqualToNum = false;
        for(int i=idx; i<sqr.length(); i++) {
            String sub = sqr.substring(i, i-idx+1);
            int val = Integer.parseInt(sub);
            isEqualToNum = isEqualToNum || check(sqr, num, idx+1, currSum+val);

            if(isEqualToNum == true) return true;
        }

        return isEqualToNum;

    }

    public int punishmentNumber(int n) {
        int punish = 0;
        for(int num=1; num<=n; num++) {
            int sqr = num*num;
            if(check(Integer.toString(sqr), num, 0, 0)) {
                punish += sqr;
            }
        }
        return punish;
    }
}

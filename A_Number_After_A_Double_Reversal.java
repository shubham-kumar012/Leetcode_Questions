// Leetcode Q.2119 Easy

class Solution {

    public static int reverse(int x) {
        int a = x;
        int rev = 0;
        while(a>0){
            int rem = a % 10;
            rev = rev * 10 + rem;
            a /= 10;
        }
        return rev;
    }

    public boolean isSameAfterReversals(int num) {
        int reversed1 = reverse(num);
        int reversed2 = reverse(reversed1);
        if(reversed2 == num) return true;
        else return false;
    }
}

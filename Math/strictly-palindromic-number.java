// Q. 2396 Medium
// Link -> https://leetcode.com/problems/strictly-palindromic-number/description/

// T.C. -> O(n*logn)
// S.C. -> O(1)
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        for(int base=2; base<=n-2; base++) {
            String representation = Integer.toString(n, base);
            if(!isPalindrome(representation)) {
                return false;
            }
        }

        return true;
    }

    private boolean isPalindrome(String s) {
        int n = s.length();
        for(int i=0; i<n/2; i++) {
            if(!(s.charAt(i) == s.charAt(n-1-i))) {
                return false;
            }
        }

        return true;
    }
}

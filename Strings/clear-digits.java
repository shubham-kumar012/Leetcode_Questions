// Q.3174 Easy
// Leetcode - https://leetcode.com/problems/clear-digits/description

// T.C. -> O(n^2)
// S.C. -> O(n)
class Solution {
    public String clearDigits(String s) {
        if(s.length() <= 1) return s;
        StringBuilder sb = new StringBuilder(s);
        boolean changed = true; // This checks for if change were made

        while(changed && sb.length() >= 2) {
            changed = false;
            for(int i=1; i<sb.length(); i++) {
                if(sb.charAt(i) >= '0' && sb.charAt(i) <= '9') {
                    sb.delete(i-1, i+1);
                    changed = true;
                    break;
                }
            }
        }
        return sb.toString();
    }
}

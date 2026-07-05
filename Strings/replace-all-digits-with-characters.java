// Space Complextiy - O(n)
// Time Complexity - O(n)
// Leetcode - https://leetcode.com/problems/replace-all-digits-with-characters/

class Solution {
    public String replaceDigits(String s) {
        StringBuilder res = new StringBuilder();
        int i = 1;
        res.append(s.charAt(0));
        while(i < s.length()) {
            char ch = s.charAt(i);

            if(Character.isDigit(ch)) {
                int digit = (int) ch - '0';
                char newCh = (char) (s.charAt(i-1) + digit);

                res.append(newCh);
            } else {
                res.append(ch);
            }
            i++;
        }

        return res.toString();
    }
}

// Q.3280 Easy
// Leetcode - https://leetcode.com/problems/convert-date-to-binary/description/

// T.C. -> O(n)
// S.C. -> O(n)

class Solution {
    public String convertDateToBinary(String date) {
        int n = date.length();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<n; i++) {
            int a = 0;
            while(i < n && date.charAt(i) != '-') {
                a = a * 10 + (date.charAt(i) - 48);
                i++;
            }
            res.append(Integer.toBinaryString(a));
            if(i<n-1) res.append("-");
        }

        return res.toString();
    }
}

// Time Complexity - O(n + m)
// Space Complexity - O(q + r), where q, r=total no. of chars in word1 and word2 respectively
// Leetcode - https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String s : word1) {
            sb1.append(s);
        }

        for(String s : word2) {
            sb2.append(s);
        }


        return sb1.toString().equals(sb2.toString());
    }
}

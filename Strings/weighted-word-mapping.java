// Time complexity - O(n * m) 
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/weighted-word-mapping/

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n = words.length;
        StringBuilder res = new StringBuilder();

        for(String word : words) {
            int weight = 0;
            for(int i=0; i<word.length(); i++) {
                int idx = (int) word.charAt(i) - 'a';
                weight += weights[idx];
            }
            int resCharVal = 26 - (weight % 26);
            char resChar = (char)('a' + (resCharVal - 1));
            res.append(resChar);
        }

        return res.toString();
    }
}

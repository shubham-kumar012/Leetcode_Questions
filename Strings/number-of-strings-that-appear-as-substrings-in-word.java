// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n = patterns.length;
        int count = 0;

       for(String subStr : patterns) {
            if(word.contains(subStr)) {
                count++;
            }
        }

        return count;
    }
}

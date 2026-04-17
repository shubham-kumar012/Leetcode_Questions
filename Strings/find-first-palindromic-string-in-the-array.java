// Time Complexity - O(n * k)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/find-first-palindromic-string-in-the-array/

class Solution {
    public boolean isPalindrome(String word) {
        int n = word.length();

        int i=0;
        int j=n-1;
        while(i < j) {
            if(word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public String firstPalindrome(String[] words) {
        int n = words.length;

        for(int i=0; i<n; i++) {
            String word = words[i];
            if(isPalindrome(word)) {
                return word;
            }
        }

        return "";
    }
}

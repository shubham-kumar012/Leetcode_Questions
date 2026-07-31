// Time Complexity - O(N)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/

class Solution {
    public int minimumPushes(String word) {
        int n = word.length();

        int[] freq = new int[27];

        for(int i=0; i<n; i++) {
            int ch = (int) word.charAt(i) - 97;
            freq[ch]++;
        }

        Arrays.sort(freq);

        int key = 1;
        int pushes = 0;
        for(int i=26; i>=0; i--) {
            if(freq[i] == 0) continue;

            if(key >= 9 && key <= 16) {
                pushes += freq[i] * 2;
            } 
            else if(key >= 17 && key <= 24) {
                pushes += freq[i] * 3;
            }
            else if(key == 25 || key == 26) {
                pushes += freq[i] * 4;
            } else { // key >= 1 && key <= 8
                pushes += freq[i];
            }

            key++;
        }

        return pushes;
    }
}

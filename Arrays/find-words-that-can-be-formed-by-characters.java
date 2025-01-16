// Q.1160 Easy
// Leetcode -> https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/description/

// T.C. -> O(m + n*k)
// S.C. -> O(1)
class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        // Array to store the frequency of chars array
        char[] ch = new char[27];
        for(int i=0; i<chars.length(); i++) { // O(m)
            ch[chars.charAt(i) - 'a']++;
        }

        for(String word : words) { // O(n)
            char[] wordCh = new char[27]; // contant temp array
            for(char c : word.toCharArray()) { // O(k)
                wordCh[c - 'a']++;
            }

            boolean flag = true;
            for(char c : word.toCharArray()) { // O(k)
                if(wordCh[c - 'a'] > ch[c - 'a']) {
                    flag = false;
                    break;
                }
            }
            ans += (flag) ? word.length() : 0;
        }

        return ans;
    }
}

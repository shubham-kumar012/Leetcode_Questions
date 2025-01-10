// Q.916 Medium
// Leetcode - https://leetcode.com/problems/word-subsets/description

// T.C. -> O(n*l1 + m*l2)
// S.C. -> O(26) ~= O(1)
class Solution {

    boolean isSubset(int[] freq1, int[] temp) {
        for(int i=0; i<26; i++) {
            if(temp[i] < freq1[i]) return false;
        }

        return true;
    }

    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        int freq1[] = new int[26];

        for(String word: words2) {// O(n)
            int[] temp = new int[26];

            for(char ch : word.toCharArray()) {// O(l1)
                temp[ch - 'a']++;

                freq1[ch - 'a'] = Math.max(temp[ch - 'a'], freq1[ch - 'a']);
            }
        }


        for(String word : words1) {// O(m)
            int[] temp = new int[26];
    
            for(char ch : word.toCharArray()) {// O(l2)
                temp[ch - 'a']++;
            }

            if(isSubset(freq1, temp)) {
                res.add(word);
            }
        }

        return res;
    }
}

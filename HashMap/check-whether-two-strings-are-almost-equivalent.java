// Q.2068 Easy
// Leetcode - https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/description 


class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        // Method 1 - Using Two hashmap
        // T.C. -> O(n+m) 
        // S.C. -> O(m+n)
        // Map<Character, Integer> freq1 = new HashMap<>();
        // Map<Character, Integer> freq2 = new HashMap<>();
        // // Storing frequency of word1
        // for(int i=0; i<word1.length(); i++) {
        //     freq1.put(word1.charAt(i), freq1.getOrDefault(word1.charAt(i), 0) + 1);
        // }
        // // Storing frequency of word2
        // for(char c : word2.toCharArray()) {
        //     freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        // }
        // // check from freq1 
        // for(var key : freq1.keySet()) {
        //     int value1 = freq1.get(key);
        //     int value2;
        //     if(!freq2.containsKey(key))
        //         value2 = 0;
        //     else
        //         value2 = freq2.get(key);

        //     if(Math.abs(value1 - value2) > 3) {
        //         return false;
        //     }
        // }
        // // check from freq2
        // for(var key : freq2.keySet()) {
        //     int value1 = freq2.get(key);
        //     int value2;
        //     if(!freq1.containsKey(key))
        //         value2 = 0;
        //     else
        //         value2 = freq1.get(key);

        //     if(Math.abs(value1 - value2) > 3) {
        //         return false;
        //     }
        // }

        // return true;


        
        // Method 2 - Using contant array mapping
        // T.C. -> O(m+n)
        // S.C. -> O(1)
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        // Storing frequencies of word1 chars in freq1
        for(char c : word1.toCharArray()) freq1[c-'a']++;
        // Storing frequencies of word2 chars in freq2
        for(char c : word2.toCharArray()) freq2[c-'a']++;
        // Now check for absolute difference with condition
        for(int i=0; i<26; i++) {
            if(Math.abs(freq1[i] - freq2[i]) > 3) return false;
        }
        return true;
    }
}

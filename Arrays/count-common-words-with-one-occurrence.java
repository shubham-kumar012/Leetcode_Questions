// Q.2085 Easy
// Leetcode - https://leetcode.com/problems/count-common-words-with-one-occurrence/description

// T.C. -> O(n+m)
// S.C. -> O(n+m)
class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0; // counter for common word
        Map<String, Integer> map1 = new HashMap<>();
        for(String word : words1) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }

        Map<String, Integer> map2 = new HashMap<>();
        for(String word : words2) {
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }

        for(var key : map1.keySet()) {
            if(map1.get(key) == 1 && map2.getOrDefault(key, 0) == 1) {
                count++;
            }
        }

        return count;
        
    }
}

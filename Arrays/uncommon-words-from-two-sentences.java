// Time Complexity - O(n * m)
// Space Complexity - O(n + m)
// Leetcode - https://leetcode.com/problems/uncommon-words-from-two-sentences/

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<str1.length; i++) {
            map.put(str1[i], map.getOrDefault(str1[i], 0) + 1);
        }
        for(int i=0; i<str2.length; i++) {
            map.put(str2[i], map.getOrDefault(str2[i], 0) + 1);
        }
        
        int size = 0;
        for(String word : map.keySet()) {
            if(map.get(word) == 1) {
                size++;
            }
        }

        String[] res = new String[size];
        int i = 0;
        for(String word : map.keySet()) {
            if(map.get(word) == 1) {
                res[i++] = word;
            }
        }

        return res;
    }
}

// Q.819 Easy
// Leetcode - https://leetcode.com/problems/most-common-word/description/

// T.C. -> O(n + m)
// S.C. -> O(k + m)
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        int n = paragraph.length();
        // convert String to character array
        String[] word = paragraph.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
        Map<String, Integer> freq = new HashMap<>();

        // count freq of each word and put it in map
        String temp = "";
        for(int i=0; i<word.length; i++) {
            String s = word[i];
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        // Traversing banned array and remove from that word in map
        for(String s : banned) {
            if(freq.containsKey(s)) {
                freq.remove(s);
            }
        }

        // traversing map return those who have most frequency
        int max = Integer.MIN_VALUE;
        for(var key : freq.keySet()) {
            max = Math.max(freq.get(key), max);
        }

        String res = "";
        for(var key : freq.keySet()) {
            if(freq.get(key) == max) {
                res += key;
            }
        }

        return res;

    }
}

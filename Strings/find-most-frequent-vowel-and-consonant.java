// Time Complexity - O(n)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/

class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();

        HashMap<Character, Integer> vovel = new HashMap<>();
        HashMap<Character, Integer> consonant = new HashMap<>();
        String allVovel = "aeiou";

        for(int i=0; i<n; i++) {
            if("aeiou".indexOf(s.charAt(i)) != -1) {
                vovel.put(s.charAt(i), vovel.getOrDefault(s.charAt(i), 0)+1);
            } else {
                consonant.put(s.charAt(i), consonant.getOrDefault(s.charAt(i), 0)+1);
            }
        }

        int maxVovel = 0;
        int maxConsonant = 0;

        for(var key : vovel.keySet()) {
            maxVovel = Math.max(maxVovel, vovel.get(key));
        }
        for(var key : consonant.keySet()) {
            maxConsonant = Math.max(maxConsonant, consonant.get(key));
        }

        return maxVovel + maxConsonant;
    }
}

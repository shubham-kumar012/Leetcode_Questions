// Time Complexity - O(n * m)
// Space Complexity - O(n * m)
// Leetcode - https://leetcode.com/problems/unique-morse-code-words/description

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodeList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>(); // set for storing distinct transformation

        for(int i=0; i<words.length; i++) { // travese through words array
            String word = words[i];
            StringBuilder morseCode = new StringBuilder();
            for(int j=0; j<word.length(); j++) { // converting single word to morse code
                String code = morseCodeList[word.charAt(j) - 'a'];
                morseCode.append(code);
            }

            words[i] = morseCode.toString();
            set.add(words[i]);
        }

        return set.size();
    }
}

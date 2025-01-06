// Q.2325 Easy
// Leetcode - https://leetcode.com/problems/decode-the-message/

// T.C. -> O(m + k)
// S.C. -> O(m + k)
class Solution {
    public String decodeMessage(String key, String message) {
        // Array Where We Store Our Decoded Message
        char[] decodedMessage = new char[message.length()];
        // Trim the space from the key
        key = key.replace(" ", "");
        // Create the mapping key between values
        Map<Character, Character> mp = new HashMap<>();
        char ch = 'a'; // The value storing correcponding to the key
        for(char keyCh : key.toCharArray()) {
            if(!(mp.containsKey(keyCh))) {
                mp.put(keyCh, ch);
                ch++;
            }
        }

        // Now Decoded Message Added to Our Answer  
        for(int i=0; i<message.length(); i++) {
            if(message.charAt(i) == ' ') {
                decodedMessage[i] = message.charAt(i);
            }else {
                decodedMessage[i] = mp.get(message.charAt(i));
            }
        }

        return new String(decodedMessage);
    }
}

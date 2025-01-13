// Q.3223  Medium
// Leetcode - https://leetcode.com/problems/minimum-length-of-string-after-operations/description

class Solution {
    public int minimumLength(String s) {
        // T.C. -> O(n)
        // S.C. -> O(n)
        // Method 1 - Count frequency in map 
        // int res = 0;
        // HashMap<Character, Integer> map = new HashMap<>();

        // for(char ch : s.toCharArray()) {
        //     if(map.containsKey(ch)) {
        //         map.put(ch, map.get(ch)+1);
        //         if(map.get(ch) > 2) {
        //             map.put(ch, map.get(ch) -2);
        //         }
        //     } else {
        //         map.put(ch, 1);
        //     }
            
        // }

        // for(Integer value : map.values()) {
        //     System.out.print(value+" ");
        //     res += value;
        // }

        // return res;


        // T.C. -> O(n)
        // S.C. -> O(1)
        // Method 2 - Count frequency in array
        // int[] freq = new int[26];
        // int res = 0;
        // for(char ch : s.toCharArray()) {
        //     freq[ch - 'a']++;
        //     if(freq[ch - 'a'] > 2) {
        //         freq[ch - 'a'] -= 2;
        //     }
        // }

        // for(int i = 0; i < 26; i++) {
        //     res += freq[i];
        // }

        // return res;


        // T.C. -> O(n)
        // S.C. -> O(1) // but this is more optimize than previous
        // Method 3 - Count freqency and if frequency is odd string length is -1- and for even length is -2-
        int[] freq = new int[26];

        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        } 

        int res = 0;
        for(int i = 0; i < 26; i++) {
            if(freq[i] == 0) continue;
            if(freq[i] % 2 == 0) {
                res += 2;
            } else {
                res += 1;
            }
        }

        return res;
    }
}

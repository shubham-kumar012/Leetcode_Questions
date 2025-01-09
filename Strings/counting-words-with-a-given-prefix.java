// Q.2185 Easy
// Leetcode - https://leetcode.com/problems/counting-words-with-a-given-prefix/description


class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = words.length;
        int count = 0;
        
        // Method 1 - T.C. -> O(n*m)
        // for(int i = 0; i < n; i++) {
        //     boolean flag = true;
        //     String s = words[i];
        //     if(s.length() < pref.length()) continue; 
        //     for(int j = 0; j < pref.length(); j++) {
        //         if(pref.charAt(j) != s.charAt(j)) {
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if(flag) count++;
        // }
        // return count;


        // Method 2 - T.C. -> O(n * m)
        for(int i = 0; i < n; i++) {
            if(words[i].startsWith(pref)) count++;
        }

        return count;
    }
}

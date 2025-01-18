// Q.2586 Easy
// Leetcode - https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/description

// T.C. -> O(n)
// S.C. -> O(k)
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++) {
            char[] ch = words[i].toCharArray();
           
            if((ch[0] == 'a' || ch[0] == 'e' || ch[0] == 'i' || ch[0] == 'o' || ch[0] == 'u')
            && (ch[ch.length-1] == 'a' || ch[ch.length-1] == 'e' || ch[ch.length-1] == 'i' || ch[ch.length-1] == 'o' || ch[ch.length-1] == 'u')) {
                count++;
            }
        }
        return count;
    }
}

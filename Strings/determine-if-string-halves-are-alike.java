// Time Complexity - O(n/2)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/determine-if-string-halves-are-alike/

class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vovels = new HashSet<>();
        char[] vovelsChar = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

        for(int i=0; i<vovelsChar.length; i++) {
            vovels.add(vovelsChar[i]);
        }

        int a = 0, b = 0;

        for(int i=0; i<s.length()/2; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt((s.length()/2) + i);

            if(vovels.contains(ch1)) {
                a++;
            }
            if(vovels.contains(ch2)) {
                b++;
            }
        }

        return a==b ? true : false;
    }
}

// Q.2062 Easy
// Leetcode -> https://leetcode.com/problems/count-vowel-substrings-of-a-string/description/

// T.C. -> O(n^2)
// S.C. -> O(1)
class Solution {
    public int countVowelSubstrings(String word) {
        int n = word.length();
        if(n < 5) return 0;

        // Creating a list of vovels
        HashSet<Character> vovelList = new HashSet<>();
        vovelList.add('a');
        vovelList.add('e');
        vovelList.add('i');
        vovelList.add('o');
        vovelList.add('u');

        int res = 0; // storing for result

        for(int i=0; i<n && (n-i) >= 5; i++) {
            if(!vovelList.contains(word.charAt(i))) { // if character are consonent
                continue;
            }

            Set<Character> diffVovelCount = new HashSet<>(); // this set count for distinct vovels in the window
            for(int j=i; j<n; j++) {
                if(!vovelList.contains(word.charAt(j))) { // if character are consonent
                    break;
                }
                
                diffVovelCount.add(word.charAt(j));
                if(diffVovelCount.size() == 5) {
                    res++;
                }
            }
        }


        return res;
    }
}

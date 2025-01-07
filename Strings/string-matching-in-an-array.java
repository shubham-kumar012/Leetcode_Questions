// Q.1408 Easy
// Leetcode -> https://leetcode.com/problems/string-matching-in-an-array/description


// T.C. -> O(n^2 * m)
// S.C. -> O(1)
class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> res = new ArrayList<>();
    
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j!=i) {
                    if(words[j].contains(words[i])) {
                        res.add(words[i]);
                        break;
                    }
                }
            }
        }

        return res;
    }
}

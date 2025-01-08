// Q.3042 Easy
// Leetcode - https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/description/

// T.C. -> O(n^2 * K)
// S.C. -> O(1)
class Solution {

    boolean isPrefixAndSuffix(String s1, String s2) {
        boolean flag = true;
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 > n2) return false;

        for(int i = 0, j = n1 - 1; i < n1 && j >= 0; i++, j--) {
            if(s1.charAt(i) != s2.charAt(i)) {
                flag = false;
                break;
            } 

            if(s1.charAt(j) != s2.charAt((n2-1)-i)) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;

        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }
}

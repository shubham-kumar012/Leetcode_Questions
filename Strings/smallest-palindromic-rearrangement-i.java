// Time complexity - O(n)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/smallest-palindromic-rearrangement-i/

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();

        int freq[] = new int[27];

        for(int i=0; i<n; i++) {
            int charIdx =(int) s.charAt(i) - 97;
            freq[charIdx]++;
        }


        char[] res = new char[n];
        int k = 0; // index for res
        for(int i=0; i<27; i++) {
            if(freq[i] > 0) {
                char ch =(char) (i + 97); // character to be add
                int it = freq[i] / 2; // iteration of loop are going to run
                int remainChar = freq[i] % 2; // if freq is odd
                while(it > 0) {
                    res[k] = ch;
                    res[n-k-1] = ch;
                    k++;
                    it--;
                }

                if(remainChar > 0) {
                    res[n/2] = ch;
                }
            }

            if(k > (n-k-1)) break;
        }

        return new String(res);


    }
}

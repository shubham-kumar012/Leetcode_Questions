// Q.2559 [Medium]
// T.C. -> 
class Solution {

    // check vovels for first and last character
    static boolean checkVovel(String s) {
        String vovel = "aeiouAEIOU";

        char first = s.charAt(0);
        char second = s.charAt(s.length()-1);

        if(vovel.indexOf(first) >= 0 && vovel.indexOf(second) >= 0) {
            return true;
        }
        return false;
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int ans[] = new int[queries.length];
        
        // prefix sum array for storing the occurences of vovel string
        int[] prefix = new int[words.length];
        // counter for vovel string
        int countStr = 0;

        // process the prefix sum/ commulative sum array
        for(int i=0; i<words.length; i++) {
            String s = words[i];
            if(checkVovel(s)) {
                countStr++;
            }
            prefix[i] =  countStr;
        }

        // precess queries to fill our answer
        for(int i=0; i<queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            ans[i] = prefix[r] - ((l > 0) ? prefix[l-1] : 0);
        }

        return ans;
    }
}

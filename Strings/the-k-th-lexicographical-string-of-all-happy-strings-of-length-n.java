// Q.1415 Medium
// Leetcode - https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/

// T.C. -> O(2^n)
// S.C. -> O(2^n * n)
class Solution {

    void solve(List<String> result, StringBuilder s, int n) {
        if(s.length() == n) {
            result.add(s.toString()); // add string to the result
            return;
        }

        for(int i='a'; i<='c'; i++) {
            char ch = (char) i;
            if(s.length() != 0 && ch == s.charAt(s.length()-1)) continue; // if duplicate occur then we don't consider that char
            
            solve(result, s.append(ch), n); // append the char to string call for next

            s.deleteCharAt(s.length()-1); // delete the added char so that next will be add (backtrack step)
        }
    }

    public String getHappyString(int n, int k) {
        List<String> result = new ArrayList<>();

        solve(result, new StringBuilder(""), n);

        return (k > result.size()) ? "" : result.get(k-1);
    }
}

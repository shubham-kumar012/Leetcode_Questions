// Q.2375 Medium
// Leetcode - https://leetcode.com/problems/construct-smallest-number-from-di-string/

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        Stack<Integer> st = new Stack<>();
        char[] result = new char[n+1];

        int count = 1;
        int idx = 0;
        for(int i=0; i<n; i++) { // runs O(n)
            st.push(count);
            if(pattern.charAt(i) == 'I') { // runs O(n) only when 'I' encounter
                while(!st.isEmpty()) {
                    result[idx++] = (char) ('0' + st.pop());
                }
            }
            count++;
        }
        st.push(count);
        while(!st.isEmpty()) {
            result[idx++] = (char) ('0' + st.pop());
        }

        return new String(result);
    }
}

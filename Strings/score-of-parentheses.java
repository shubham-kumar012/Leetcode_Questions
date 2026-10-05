// Leetcode - https://leetcode.com/problems/score-of-parentheses
// Time Complexity - O(n)
// Space Complexity - O(n/2)  ~ O(n)

class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack();
        st.push(0);
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                st.push(0);
            }

            if(s.charAt(i) == ')') {
                int top = st.pop();
                int A = Math.max((2*top), 1);
                int B = st.pop();
                st.push(A+B);
            }
        }

        return st.pop();
    }
}

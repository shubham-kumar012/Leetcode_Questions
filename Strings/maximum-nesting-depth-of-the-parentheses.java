// Leetcode - https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

class Solution {
    public int maxDepth(String s) {
        // Time Complexity - O(n)
        // Space Complexity - O(n/2)
        // Method 1: Using Stack
        Stack<Character> st = new Stack<>();
        int res = 0;

        // for(int i=0; i<s.length(); i++) {
        //     if(s.charAt(i) == '(') {
        //         st.push('(');
        //     } else if(!st.empty() && s.charAt(i) == ')') {
        //         st.pop();
        //     }

        //     res = Math.max(res, st.size());
        // }

        // Time Complexity - O(n)
        // Space Complexity - O(1)
        // Method 2: Without using stack
        int tempDept = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                tempDept++;
            } else if(s.charAt(i) == ')') {
                tempDept--;
            }

            res = Math.max(res, tempDept);
        }


        return res;
    }
}

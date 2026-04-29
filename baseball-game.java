// Time Complexity - O(n)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/baseball-game/

class Solution {
    public int calPoints(String[] ops) {
        int n = ops.length;
        Stack<String> st = new Stack();

        for(int i=0; i<n; i++) {
            if(ops[i].equals("+")) {
                String prev = st.pop();
                int newScore = Integer.parseInt(prev) + Integer.parseInt(st.peek());
                st.push(prev);
                st.push(String.valueOf(newScore));
            } else if(ops[i].equals("D")) {
                int newScore = Integer.parseInt(st.peek()) * 2;
                st.push(String.valueOf(newScore));
            } else if(ops[i].equals("C")) {
                st.pop();
            } else { // integer case
                st.push(ops[i]);
            }
        }

        int res = 0;
        while(!st.isEmpty()) {
            res += Integer.parseInt(st.pop());
        }

        return res;
    }
}

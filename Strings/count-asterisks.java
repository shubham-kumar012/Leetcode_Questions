// Leetcode - https://leetcode.com/problems/count-asterisks/

class Solution {
    public int countAsterisks(String s) {
        // Method 1 - Using stack
        // T.C - O(n)
        // S.C - O(n)
        // Stack<Character> st = new Stack();
        // int countStar = 0;

        // int i = 0;
        // while(i < s.length()) {
        //     char ch = s.charAt(i);

        //     if(st.isEmpty() && ch == '*') {
        //         countStar++;
        //     } else if(st.isEmpty() && ch == '|') {
        //         st.push(ch);
        //     } else if(!st.isEmpty() && ch == '|') {
        //         st.pop();
        //     }
        //     i++;
        // }

        // return countStar;


        // Method 2 - Without stack
        // T.C. - O(n)
        // S.C. - O(1)
        int countStar = 0;
        boolean inBars = false;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(!inBars && ch == '*') {
                countStar++;
            } else if(!inBars && ch == '|') {
                inBars = true;
            } else if(inBars && ch == '|') {
                inBars = false;
            }
        }

        return countStar;



    }
}

// Time Complexity - O(n)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sw = new Stack();
        Queue<Integer> st = new LinkedList<>();
        int freqOne = 0;
        int freqZero = 0;

        for(int i=0; i<students.length; i++) {
            st.offer(students[i]);
            if(students[i] == 1) {
                freqOne++;
            } else {
                freqZero++;
            }
        }

        for(int i=sandwiches.length-1; i>=0; i--) {
            sw.push(sandwiches[i]);   
        }

        while(!st.isEmpty() || !sw.isEmpty() || freqOne == 0 && freqZero == 0) {
            if(!sw.isEmpty() && sw.peek() == 1) {
                if(freqOne <= 0) {
                    break;
                }
                if(st.peek() == 1) {
                    st.poll();
                    sw.pop();
                    freqOne--;
                } else {
                    st.offer(st.poll());
                }
            } else {
                if(freqZero <= 0) {
                    break;
                }
                if(st.peek() == 0) {
                    st.poll();
                    sw.pop();
                    freqZero--;
                } else {
                    st.offer(st.poll());
                }
            }
        }

        return st.size();
    }
}

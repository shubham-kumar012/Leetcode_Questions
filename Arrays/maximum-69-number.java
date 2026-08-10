// Time Complexity - O(logn)
// Space Complexity - O(logn)
// Leetcode - https://leetcode.com/problems/maximum-69-number/

class Solution {
    public int maximum69Number (int num) {
        int n = 0;
        ArrayList<Character> list = new ArrayList<>();
        while(num != 0) {
            int rem = num % 10;
            char ch = (char) (rem + '0');
            list.add(ch);
            num /= 10;
        }

        Collections.reverse(list);
        int newNum = 0;
        boolean changed = false;
        for(int i=0; i<list.size(); i++) {
            int curr =(int) (list.get(i) - '0');
            if(!changed && curr == 6) {
                newNum = (newNum * 10) + 9;
                changed = true;
            } else {
                newNum = (newNum * 10) + curr;
            }
        }

        return newNum;
    }
}

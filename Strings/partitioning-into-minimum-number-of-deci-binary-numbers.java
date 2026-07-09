// Leetcode - https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/

class Solution {
    public int minPartitions(String n) {
        // Method 1 : 
        // T.C. - O(M * N)
        // S.C. - O(N)
        int len = n.length();
        int ans = 0;
        StringBuilder num = new StringBuilder(n);

        StringBuilder str = new StringBuilder();
        for(int i=0; i<len; i++) {
            str.append('0');
        }

        boolean flag = true;
        while(flag) {
            StringBuilder newNum = new StringBuilder("");
            for(int j=0; j<len; j++) {
                if(num.charAt(j) != '0') {
                    int n1 =(int) (num.charAt(j) - '0'); // get the num original num
                    char cal =(char) ('0' + (n1 - 1)); // calculated new number to be appen
                    newNum.append(cal); // append into the "newNum" 
                } else {
                    newNum.append("0");
                }
            }

            num = newNum;
            ans++;
            if(num.toString().equals(str.toString())) {
                flag = false;
            }
        }

        return ans;


      // Method 2:
      // T.C. - O(N)
      // S.C. - O(1)

      int len = n.length();
        int max = 0;
        for(int i=0; i<len; i++) {
            if(n.charAt(i) == '9') {
                return 9;
            }
            int num = n.charAt(i) - '0';
            max = Math.max(num, max);
        }

        return max;
        
    }
}

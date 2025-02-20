// Q.1980 Medium
// Leetcode - https://leetcode.com/problems/find-unique-binary-string/description/

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        // Method - 1
        // T.C. -> O(2^n * n)
        // S.C. -> O(n)    
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(String s : nums) {
            set.add(Integer.parseInt(s, 2));
        }

        int comb = (int) Math.pow(2, n); // total combinations
        String ans = "";

        for(int i=0; i<=comb; i++) {
            if(!set.contains(i)) {
                ans = String.format("%"+ n +"s", Integer.toBinaryString(i)).replace(' ', '0'); // ensure that ans will be in n bits even if it zero
                break;
            }
        }
        return ans;


        // Method - 2
        // T.C. -> O(n^2)
        // S.C. -> O(n)
        // int n = nums.length;
        // StringBuilder ans = new StringBuilder();

        // for(int i=0; i<n; i++) {
        //     char flippedBit = nums[i].charAt(i) == '0' ? '1' : '0';
        //     ans.append(flippedBit);
        // }

        // return ans.toString();
    }
}

// Time Complexity - O(n * d^2) -> d^2 due to shifting mechanism in addAll method
// Space Complexity - O(n * d)
// Leetcode - https://leetcode.com/problems/separate-the-digits-in-an-array/

class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> resList = new ArrayList<>();

        for(int num : nums) {
            ArrayList<Integer> temp = new ArrayList<>();

            while(num > 0) {
                int rem = num % 10;
                temp.add(0, rem);
                num /= 10;
            }

            resList.addAll(temp);
        }

        int[] res = new int[resList.size()];

        for(int i=0; i<resList.size(); i++) {
            res[i] = resList.get(i);
        }

        return res;
    }
}

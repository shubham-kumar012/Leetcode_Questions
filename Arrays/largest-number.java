// Time Complexity - O(n logn)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/largest-number/

class Solution {
    public String largestNumber(int[] nums) {
        String[] store = new String[nums.length];

        // Storing the element in the form of string
        for(int i=0; i<nums.length; i++) {
            store[i] = String.valueOf(nums[i]);
        }

        // Sort them based on specific condition
        Arrays.sort(store, (a, b) -> {
            String n1 = a + b;
            String n2 = b + a;

            return n2.compareTo(n1);
        });
        
        // if string has 0 even after sorting
        if(store[0].equals("0")) return "0";

        // Storing the result in 'res' stringbuilder
        StringBuilder res = new StringBuilder();

        for(int i=0; i<nums.length; i++) {
            res.append(store[i]);
        }

        return res.toString();

    }
}

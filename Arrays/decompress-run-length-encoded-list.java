// Leetcode - https://leetcode.com/problems/decompress-run-length-encoded-list/
// T.C. = O(n * m)
// S.C. => O(m)

class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<nums.length/2; i++) {
            int freq = nums[2*i];
            int val = nums[2*i+1];

            while(freq > 0) {
                al.add(val);
                freq--;
            }
        }

        int[] res = new int[al.size()];
        for(int i=0; i<al.size(); i++) {
            res[i] = al.get(i);
        }
        return res;
    }
}

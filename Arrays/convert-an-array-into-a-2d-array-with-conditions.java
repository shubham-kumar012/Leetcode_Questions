// Q.2610 Medium
// Link - https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/
// T.C. => O(k * n) where, k is no. of unique elements
// S.C. => O(n)


class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // store the freq of each ele
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        boolean flag = true;
        while(flag) {
            List<Integer> temp = new ArrayList<>();
            for(int ele : map.keySet()) {
                if(map.get(ele) > 0) {
                    temp.add(ele);
                    map.put(ele, map.get(ele)-1);
                }
            }

            // if temp list has no ele it's mean all ele freq are 0
            if(temp.size() == 0) flag = false;

            // add the lisl to result
            if(temp.size() > 0) {
                res.add(temp);
            }
        }

        return res;
    }
}

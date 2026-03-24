// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/count-items-matching-a-rule/

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);

        for(int i=0; i<items.size(); i++) {
            int idx = map.get(ruleKey);

            if(items.get(i).get(idx).equals(ruleValue)) {
                res++;
            }
        }

        return res;
    }
}

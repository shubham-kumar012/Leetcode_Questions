// Q. 2103 Easy
// Leetcode - https://leetcode.com/problems/rings-and-rods/description/

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int countPoints(String rings) {
        int res = 0;
        int n = rings.length();
        HashMap<Integer, HashSet<Character>> map = new HashMap<>();

        for(int i=0; i<n; i+=2) {
            int rod = Character.getNumericValue(rings.charAt(i+1));
            map.putIfAbsent(rod, new HashSet<>());
            map.get(rod).add(rings.charAt(i));
        }


        for(int key : map.keySet()) {
            if(map.get(key).size() == 3) {
                res++;
            }
        }


        return res;
    }
}

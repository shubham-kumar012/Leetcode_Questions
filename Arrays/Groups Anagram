/*
  LeetCode Link : https://leetcode.com/problems/group-anagrams/description/
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a result List
        List<List<String>> result = new ArrayList<>();

        // Create a map that stores all the original strings corresponding to that sorted key.
        /*  aet : [eat,tea,ate], 
            ant : [tan,nat], 
            abt : [bat]              */

        Map<String, List<String>> mp = new HashMap<>();
        for(String a : strs){
            char[] arr = a.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);

            mp.putIfAbsent(temp, new ArrayList<>());
            mp.get(temp).add(a);
        }

        // Now putting all values(list) into result
        for(var entry : mp.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }
}

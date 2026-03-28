// Time Complexity - O(n logn)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/sort-vowels-in-a-string

class Solution {
    public String sortVowels(String s) {
        int n = s.length();

        StringBuilder res = new StringBuilder();
        ArrayList<Character> vovels = new ArrayList<>();
        // Add vovels to the set
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        for(int i=0; i<n; i++) {
            if(set.contains(s.charAt(i))) {
                vovels.add(s.charAt(i));
            }
        }

        // sort the vovels
        Collections.sort(vovels);

        // Making our result
        int idx = 0; // index for vovels
        for(int i=0; i<n; i++) {
            if(set.contains(s.charAt(i))) {
                res.append(vovels.get(idx++));
            } else {
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }
}

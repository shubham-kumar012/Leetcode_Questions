// Time Complexity - O(n logn)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-i/

class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] even1 = new char[2], even2 = new char[2];
        char[] odd1 = new char[2], odd2 = new char[2];

        int e = 0, o = 0;
        for(int i=0; i<4; i++) {
            if((i & 1) == 1) { //odd
                odd1[o] = s1.charAt(i);
                odd2[o] = s2.charAt(i);
                o++;
            } else {
                even1[e] = s1.charAt(i);
                even2[e] = s2.charAt(i);
                e++;
            }
        }

        Arrays.sort(even1);
        Arrays.sort(even2);
        Arrays.sort(odd1);
        Arrays.sort(odd2);

        return Arrays.equals(even1, even2) && Arrays.equals(odd1, odd2);
    }
}

// Time Complexity - O(n * k)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        if(words[startIndex].equals(target)) return 0;
        
        int dist = 1;
        int i = (startIndex + 1) % n;
        int j = (startIndex - 1 + n) % n;

        while(!(i == startIndex && j == startIndex)) {
            if(words[i].equals(target) || words[j].equals(target)) {
                return dist;
            } 
            dist++;
            i = (i+1) % n;
            j = (j-1 + n) % n;
        }


        return -1;
    }
}

// Space Complexity - O(m)
// Time Complexity - O(n^2 mlogm)
// Leetcode - https://leetcode.com/problems/find-maximum-number-of-string-pairs/

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        int count = 0;

        for(int i=0; i<n-1; i++) {
            char[] arr1 = words[i].toCharArray();
            Arrays.sort(arr1);
            String s1 = new String(arr1);

            for(int j=i+1; j<n; j++) {
                char[] arr2 = words[j].toCharArray();
                Arrays.sort(arr2);
                String s2 = new String(arr2);
                if(s1.equals(s2)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}

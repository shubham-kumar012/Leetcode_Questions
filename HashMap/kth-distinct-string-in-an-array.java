// Q.2053 Easy
// Leetcode - https://leetcode.com/problems/kth-distinct-string-in-an-array/description/

class Solution {

    public boolean isDistinct(String[] arr, int idx) { // Check if that element are distinct or not
        for(int i=0; i<arr.length; i++) {
            if(i != idx && arr[i].equals(arr[idx])) {
                return false;
            }
        }
        return true;
    }
  
    public String kthDistinct(String[] arr, int k) { // main
        // Method 1 - O(n^2) (Brute Force)
        // T.C. - O(n^2)
        // S.C. - O(1)
        // String res = new String();
        // int distinct = 1;
        // for(int i=0; i<arr.length; i++) {
        //     if(isDistinct(arr, i)) {
        //         if(distinct==k) {
        //             res += arr[i];
        //         }
        //         distinct++;
        //     }
        // }
        // return res;


        // Mathod 2 - Using hashset 
        // T.C. - O(n)
        // S.C. - O(n)
        Set<String> distinct = new HashSet<>();
        Set<String> seen = new HashSet<>();
        
        for(String s : arr) {
            if(!seen.add(s)) {
                distinct.remove(s);
            } else {
                distinct.add(s);
            }
        }
        
        int distinctCount = 1;
        for(String s : arr) {
            if(distinct.contains(s) && distinctCount++ == k) {
                return s;
            }  
        }
        return "";
    }
}
